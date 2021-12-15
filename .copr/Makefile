.PHONY: installdeps srpm

installdeps:
	dnf install -y \
		autoconf \
		automake \
		createrepo_c \
		dnf-utils \
		findutils \
		git \
		java-11-openjdk-devel \
		make \
		maven-profile \
		maven-plugin-registry \
		maven-source-plugin \
		maven-shade-plugin \
		maven \
		rpm-build \
		sed


srpm: installdeps
	$(eval SUFFIX=$(shell sh -c " echo '.$$(date -u +%Y%m%d%H%M%S).git$$(git rev-parse --short HEAD)'"))
	# changing the spec file as passing -D won't preserve the suffix when rebuilding in mock
	sed "s:%{?release_suffix}:${SUFFIX}:" -i java-client-kubevirt.spec.in

	.automation/build-srpm.sh
	cp rpmbuild/SRPMS/$(shell sh -c "basename '$(spec)'|cut -f1 -d.")*.src.rpm $(outdir)
