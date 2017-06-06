SUMMARY = "Jupyter notebook"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "4048987076b85814202cd29b1dd3fc7b"
SRC_URI[sha256sum] = "5a54f25f0e6c8ee74c362c23f9a95e10e74c6b7f5ef42059c861ff6f26d89462"

RDEPENDS_${PN} += " \
	python-ipython \
	python-traitlets \
	python-tornado \
	python-jupyter-client \
	"


inherit pypi setuptools
