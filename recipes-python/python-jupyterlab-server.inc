SUMMARY = "JupyterLab Server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[sha256sum] = "72d916a73957a880cdb885def6d8664a6d1b2760ef5dca5ad665aa1e8d1bb783"

PYPI_PACKAGE = "jupyterlab_server"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-notebook \
	${PYTHON_PN}-jsonschema \
	"
