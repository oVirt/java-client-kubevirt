#!/bin/bash -xe



source automation/prepare-maven.sh

mkdir -p exported-artifacts

./autogen.sh --system

./configure
# move tarball, assuming the tarball is in the project's directory
mv *.tar.gz exported-artifacts/

## install deps
yum-builddep java-client-kubevirt.spec

## build src.rpm
suffix=".$(date -u +%Y%m%d%H%M%S).git$(git rev-parse --short HEAD)"
rpmbuild_options=("-D" "release_suffix ${suffix}")
rpmbuild \
    -D "_topdir $PWD/rpmbuild"  \
    -ta exported-artifacts/*.gz

find rpmbuild -iname \*.rpm -exec mv {} exported-artifacts/ \;

## we don't need the rpmbuild dir no more
rm -Rf rpmbuild
