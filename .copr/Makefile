.PHONY: installdeps srpm

installdeps:
	dnf -y install autoconf automake gcc git java-11-openjdk-devel maven

srpm: installdeps
	mkdir rpmbuild
	$(eval SUFFIX=$(shell sh -c " echo '.$$(date -u +%Y%m%d%H%M%S).git$$(git rev-parse --short HEAD)'"))
	# changing the spec file as passing -D won't preserve the suffix when rebuilding in mock
	sed "s:%{?release_suffix}:${SUFFIX}:" -i java-client-kubevirt.spec.in
	./autogen.sh --system
	./configure
	make dist
	rpmbuild \
		-D "_topdir rpmbuild"  \
		-ts ./*.tar.gz
	cp rpmbuild/SRPMS/*.src.rpm $(outdir)
