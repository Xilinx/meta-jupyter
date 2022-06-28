SUMMARY=" AnyIO is a asynchronous compatibility API that allows applications and libraries written against it to run unmodified on asyncio, curio and trio."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0a769411d2af7894099e8ff75058c9f"

inherit pypi setuptools3

SRC_URI[sha256sum] = "24adc69309fb5779bc1e06158e143e0b6d2c56b302a3ac3de3083c705a6ed39d"
SRC_URI:append = " \
	file://0001-setup.cfg-Create-a-patch-to-set-the-pkg-version-corr.patch \
"

DEPENDS += " \
	python3-setuptools-scm-native \
	python3-wheel-native \
	python3-pip-native \
"
BBCLASSEXTEND = "native"
