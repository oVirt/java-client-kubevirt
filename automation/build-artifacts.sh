#!/bin/bash -xe



source automation/prepare-maven.sh

mkdir -p exported-artifacts

# build tarballs
./autogen.sh --system

./configure
make dist
mv *.tar.gz exported-artifacts/

## install deps
yum-builddep java-client-kubevirt.spec

## build src.rpm
# Is this a release - build from tag?
if git describe --tags |cut -f2- -d\-| grep -q '-'; then
    # This is a master build, we want to make every build
    # newer than all the previous builds using a timestamp,
    # and make it easy to locate the commit from the build
    # with the git commit hash.
    SUFFIX=".$(date -u +%Y%m%d%H%M%S).git$(git rev-parse --short HEAD)"
    rpmbuild \
        -D "_topdir $PWD/rpmbuild"  \
        -D "release_suffix ${SUFFIX}" \
        -ta exported-artifacts/*.gz
else
    # This is a build from a tagged release, we don't need suffixes.
    rpmbuild \
        -D "_topdir $PWD/rpmbuild"  \
        -ta exported-artifacts/*.gz
fi


find rpmbuild -iname \*.rpm -exec mv {} exported-artifacts/ \;

## we don't need the rpmbuild dir no more
rm -Rf rpmbuild
