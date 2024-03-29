dnl
dnl Copyright (C) 2019 Red Hat, Inc.
dnl
dnl This library is free software; you can redistribute it and/or
dnl modify it under the terms of the GNU Lesser General Public
dnl License as published by the Free Software Foundation; either
dnl version 2.1 of the License, or (at your option) any later version.
dnl
dnl This library is distributed in the hope that it will be useful,
dnl but WITHOUT ANY WARRANTY; without even the implied warranty of
dnl MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
dnl Lesser General Public License for more details.
dnl
dnl You should have received a copy of the GNU Lesser General Public
dnl License along with this library; if not, write to the Free Software
dnl Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
dnl

AC_PREREQ(2.60)

define([VERSION_MAJOR], [0])
define([VERSION_MINOR], [5])
define([VERSION_FIX], [0])
define([VERSION_NUMBER], VERSION_MAJOR[.]VERSION_MINOR[.]VERSION_FIX)
define([VERSION_SUFFIX], [])

AC_INIT([java-client-kubevirt], VERSION_NUMBER[]VERSION_SUFFIX)
PACKAGE_RPM_VERSION="VERSION_NUMBER"
PACKAGE_RPM_RELEASE="2"
PACKAGE_MAVEN_VERSION="VERSION_MAJOR.VERSION_MINOR.VERSION_FIX"
AC_SUBST([PACKAGE_RPM_VERSION])
AC_SUBST([PACKAGE_RPM_RELEASE])
AC_SUBST([PACKAGE_MAVEN_VERSION])

AC_CONFIG_AUX_DIR([.])
AC_CONFIG_SRCDIR([Makefile.am])
AC_CONFIG_MACRO_DIR([m4])
AC_USE_SYSTEM_EXTENSIONS
AM_INIT_AUTOMAKE([tar-pax])

AC_ARG_WITH(
	[maven-version-snapshot],
	[AS_HELP_STRING([--with-maven-version-snapshot], [maven version snapshot @<:@default=no@:>@])],
	,
	[with_maven_version_snapshot="no"]
)

AC_ARG_WITH(
	[dist_only],
	[AS_HELP_STRING([--with-dist-only], [configure to enable source only distribution (e.g. make dist) @<:@default=no@:>@])],
	[with_dist_only="no"],
)

AC_PROG_INSTALL
AC_PROG_SED
AC_PROG_MAKE_SET
AC_PROG_MKDIR_P

if test ! "${with_dist_only}" = "yes"; then
	    AC_ARG_VAR([MVN], [path to mvn utility])
        AC_CHECK_PROGS([MVN], [mvn])

    	test -z "${MVN}" && \
    		AC_MSG_ERROR([maven is required but not found])
fi

if test "${with_maven_version_snapshot}" = "no"; then
	MAVEN_VERSION_SNAPSHOT=""
else
	MAVEN_VERSION_SNAPSHOT="-SNAPSHOT"
fi
AC_SUBST([MAVEN_VERSION_SNAPSHOT])

AM_CONDITIONAL([WITH_DIST_ONLY], [test "${with_dist_only}" = "yes"])

AC_CONFIG_FILES([
	Makefile
	pom.xml
	java-client-kubevirt.spec
])
AC_OUTPUT
