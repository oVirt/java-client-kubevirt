#!/bin/bash -xe

# Directory, where build artifacts will be stored, should be passed as the 1st parameter
ARTIFACTS_DIR=${1:-exported-artifacts}

# Prepare source archive
[[ -d rpmbuild/SOURCES ]] || mkdir -p rpmbuild/SOURCES

./autogen.sh --system
./configure

# clean
rm -rf rpmbuild/SOURCES/*
make clean

# build tarballs
make dist

# Build SRPMs
rpmbuild \
    -D "_topdir rpmbuild" \
    -ts ./*.tar.gz
