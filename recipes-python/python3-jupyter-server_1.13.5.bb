SUMMARY = "The Jupyter Server is a web application that allows you to create \
           and share documents that contain live code, equations, \
           visualizations, and explanatory text. The Notebook has support for \
           multiple programming languages, sharing, and interactive widgets."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=0d99f15eb14ae0f6bd895f65127d0fa8"

PYPI_PACKAGE = "jupyter_server"
PN="python3-jupyter_server"

inherit pypi setuptools3

SRC_URI[sha256sum] = "9e3e9717eea3bffab8cfb2ff330011be6c8bbd9cdae5b71cef169fcece2f19d3"

do_install:append() {
	# this files will be installed by python3-notebook
	rm -f ${D}${bindir}/jupyter-bundlerextension
}

BBCLASSEXTEND = "native"

RDEPENDS:${PN} += " \
	python3-jinja2 \
	python3-tornado \
	python3-pyzmq \
	python3-ipython-genutils \
	python3-traitlets \
	python3-jupyter-core \
	python3-jupyter-client \
	python3-nbformat \
	python3-nbconvert \
	python3-send2trash \
	python3-terminado \
	python3-prometheus-client \
	"
