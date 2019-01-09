SUMMARY = "Library for building powerful interactive command lines in Python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b2cde7da89f0c1f3e49bf968d00d554f"

SRC_URI[sha256sum] = "fd17048d8335c1e6d5ee403c3569953ba3eb8555d710bfc548faf0712666ea39"

PYPI_PACKAGE = "prompt_toolkit"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-six \
	${PYTHON_PN}-wcwidth \
	"
