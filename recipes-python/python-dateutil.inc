SUMMARY = "Extensions to the standard Python datetime module"
LICENSE = "BSD | Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3155c7bdc71f66e02678411d2abf996"

BBCLASSEXTEND = "native"
PYPI_PACKAGE = "python-dateutil"

RDEPENDS_${PN} += "\
	${PYTHON_PN}-datetime \
	${PYTHON_PN}-logging \
	${PYTHON_PN}-json \
	${PYTHON_PN}-shell \
	${PYTHON_PN}-six \
	"
DEPENDS += "${PYTHON_PN}-setuptools-scm-native"
