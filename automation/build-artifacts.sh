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
SUFFIX=".$(date -u +%Y%m%d%H%M%S).git$(git rev-parse --short HEAD)"
rpmbuild \
    -D "_topdir $PWD/rpmbuild"  \
    -D "release_suffix ${SUFFIX}" \
    -ta exported-artifacts/*.gz

find rpmbuild -iname \*.rpm -exec mv {} exported-artifacts/ \;

## we don't need the rpmbuild dir no more
rm -Rf rpmbuild
