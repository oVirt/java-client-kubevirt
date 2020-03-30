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
# This is a build from a tagged release, we don't need suffixes.
rpmbuild \
    -D "_topdir $PWD/rpmbuild"  \
    -ta exported-artifacts/*.gz


find rpmbuild -iname \*.rpm -exec mv {} exported-artifacts/ \;

## we don't need the rpmbuild dir no more
rm -Rf rpmbuild
