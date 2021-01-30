SUMMARY = "Jupyter protocol implementation and client libraries"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=d235895c780fa844e875697e16e5787b"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-pyzmq \
	${PYTHON_PN}-traitlets \
	${PYTHON_PN}-jupyter-core \
	${PYTHON_PN}-tornado \
	${PYTHON_PN}-dateutil \
	"

PYPI_PACKAGE = "jupyter_client"

BBCLASSEXTEND = "native"
