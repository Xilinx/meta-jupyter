SUMMARY = "The Jupyter Notebook format"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "9d71dd1aa7ce3cc04b191cce151d6645"
SRC_URI[sha256sum] = "dbf6c0ed0cb7c5a7184536368f1dd1ada2d48fd6f016e0f9e9b69236e28c0857"

RDEPENDS_${PN} += " \
	python-traitlets \
	python-jsonschema \
	python-ipython-genutils \
	python-jupyter-core \
	"

inherit pypi setuptools
