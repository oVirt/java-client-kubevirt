#!/bin/bash -xe



MAVEN_SETTINGS="/etc/maven/settings.xml"

# Use ovirt mirror if able, fall back to central maven
mkdir -p "${MAVEN_SETTINGS%/*}"
cat >"$MAVEN_SETTINGS" <<EOS
<?xml version="1.0"?>
<settings xmlns="http://maven.apache.org/POM/4.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
          http://maven.apache.org/xsd/settings-1.0.0.xsd">

<mirrors>
        <mirror>
                <id>ovirt-maven-repository</id>
                <name>oVirt artifactory proxy</name>
                <url>http://artifactory.ovirt.org/artifactory/ovirt-mirror</url>
                <mirrorOf>*</mirrorOf>
        </mirror>
        <mirror>
                <id>root-maven-repository</id>
                <name>Official maven repo</name>
                <url>http://repo.maven.apache.org/maven222222</url>
                <mirrorOf>*</mirrorOf>
        </mirror>
</mirrors>
</settings>
EOS


# set maven 3.5 for el7
if [[ "$STD_CI_DISTRO" = "el7" ]]; then
  source /opt/rh/rh-maven35/enable

  # We need to overwrite rh-maven35 configuration for xmvn
  export XDG_DATA_DIRS="/usr/share:${XDG_DATA_DIRS}"

  XMVN_SETTINGS="/usr/share/xmvn/configuration.xml"
  mkdir -p "${XMVN_SETTINGS%/*}"
  cat > "$XMVN_SETTINGS" <<EOS
<?xml version="1.0" encoding="US-ASCII"?>
<configuration xmlns="http://fedorahosted.org/xmvn/CONFIG/2.0.0">
  <repositories>
    <repository>
      <id>install</id>
      <type>compound</type>
      <configuration>
        <repositories>
          <repository>base-install</repository>
        </repositories>
      </configuration>
    </repository>
  </repositories>
</configuration>
EOS

fi
