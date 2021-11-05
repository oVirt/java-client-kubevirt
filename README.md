# Kubevirt java client (java-client-kubevirt) for oVirt

[![Copr build status](https://copr.fedorainfracloud.org/coprs/ovirt/ovirt-master-snapshot/package/java-client-kubevirt/status_image/last_build.png)](https://copr.fedorainfracloud.org/coprs/ovirt/ovirt-master-snapshot/package/java-client-kubevirt/)

Welcome to the Kubevirt Java client (java-client-kubevirt) for oVirt source repository.

This repository is hosted on [gerrit.ovirt.org:java-client-kubevirt](https://gerrit.ovirt.org/#/admin/projects/java-client-kubevirt)
and a **backup** of it is hosted on [GitHub:java-client-kubevirt](https://github.com/oVirt/java-client-kubevirt)


## How to contribute

### Submitting patches

Patches are welcome!

Please submit patches to [gerrit.ovirt.org:java-client-kubevirt](https://gerrit.ovirt.org/#/admin/projects/java-client-kubevirt).
If you are not familiar with the review process for Gerrit patches you can read about [Working with oVirt Gerrit](https://ovirt.org/develop/dev-process/working-with-gerrit.html)
on the [oVirt](https://ovirt.org/) website.

**NOTE**: We might not notice pull requests that you create on Github, because we only use Github for backups.


### Found a bug or documentation issue?
To submit a bug or suggest an enhancement for Kubevirt java client (java-client-kubevirt) for oVirt please use
[oVirt Bugzilla java-client-kubevirt component for ovirt-distribution product](https://bugzilla.redhat.com/enter_bug.cgi?product=ovirt-distribution).

If you find a documentation issue on the oVirt website please navigate and click "Report an issue on GitHub" in the page footer.


## Still need help?
If you have any other questions, please join [oVirt Users forum / mailing list](https://lists.ovirt.org/admin/lists/users.ovirt.org/) and ask there.

## How to build

build shadow jar:
```
./gradlew shadowJar
```

publish to mavem local:
```
./gradlew uploadShadow
```

generate kubevirt sources (model + api):

```bash
java -jar swagger-codegen-cli-2.4.9.jar generate -i kubevirt-swagger.json -c config.json -l java -o _out
```
