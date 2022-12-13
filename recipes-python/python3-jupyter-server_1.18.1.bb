SUMMARY = "The Jupyter Server is a web application that allows you to create \
           and share documents that contain live code, equations, \
           visualizations, and explanatory text. The Notebook has support for \
           multiple programming languages, sharing, and interactive widgets."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=0d99f15eb14ae0f6bd895f65127d0fa8"

SRC_URI[sha256sum] = "2b72fc595bccae292260aad8157a0ead8da2c703ec6ae1bb7b36dbad0e267ea7"
SRC_URI:append = " \
	file://0001-pyproject.toml-Allow-jupyter-packaging-to-be-greater.patch \
"
PYPI_PACKAGE = "jupyter_server"

inherit pypi setuptools3

do_install:append() {
	# this files will be installed by ${PYTHON_PN}-notebook
	rm -f ${D}${bindir}/jupyter-bundlerextension
}

RDEPENDS:${PN} += " \
	${PYTHON_PN}-jinja2 \
	${PYTHON_PN}-tornado \
	${PYTHON_PN}-pyzmq \
	${PYTHON_PN}-ipython-genutils \
	${PYTHON_PN}-traitlets \
	${PYTHON_PN}-jupyter-core \
	${PYTHON_PN}-jupyter-client \
	${PYTHON_PN}-nbformat \
	${PYTHON_PN}-nbconvert \
	${PYTHON_PN}-send2trash \
	${PYTHON_PN}-terminado \
	${PYTHON_PN}-prometheus-client \
	${PYTHON_PN}-pre-commit \
	"

BBCLASSEXTEND = "native"