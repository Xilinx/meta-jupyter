SUMMARY = "A library for installing Python wheels"
DESCRIPTION = "a low-level library for installing a Python package from a wheel distribution."
HOMEPAGE = "https://installer.readthedocs.io/"
BUGTRACKER = "https://github.com/pradyunsg/installer/issues"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5038641aec7a77451e31da828ebfae00"

SRC_URI[sha256sum] = "0cd6bdab3b358cf7e8749370b99aef9e12202751271c5ddb22126599b34dc665"

inherit pypi flit_core

DEPENDS:remove:class-native = "python3-installer-native"
DEPENDS:append:class-native = " unzip-native"

do_install:class-native () {
    pip_install_wheel_do_bootstrap_install
}

BBCLASSEXTEND = "native nativesdk"
