SUMMARY = "Jupyter core package"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "3068bbc2b8275d08bf84787d4f0a3bd5"
SRC_URI[sha256sum] = "44ec837a53bebf4e937112d3f9ccf31fee4f8db3e406dd0dd4f0378a354bed9c"

RDEPENDS_${PN} += " \
	python-traitlets \
	"
	
PYPI_PACKAGE = "jupyter_core"

do_install_append() {
	# this files will be installed by python-jupyter
	rm ${D}/usr/lib/python2.7/site-packages/jupyter.pyc
	rm ${D}/usr/lib/python2.7/site-packages/jupyter.py
}

inherit pypi setuptools
