SUMMARY = "Interactive plotting for the Jupyter notebook, using d3.js and \
	   ipywidgets."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=822b4ff4dd277d70fc2b796617ae1bf7"

PYPI_PACKAGE = "bqplot"

inherit pypi setuptools3

SRC_URI[sha256sum] = "cd880a84bd495ee5bf0687b496ddbc8049d2a9feff056f9343213e83e71737f7"

DEPENDS += " \
	python3-jupyter_packaging-native \
"
RDEPENDS:${PN} += " \
	python3-ipywidgets \
	python3-traitlets \
	python3-traittypes \
	python3-numpy \
	python3-pandas \
	"

do_install:append() {
	# this files will be installed by python3-json5
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/tests/__pycache__/__init__.cpython-37.pyc
}

FILES:${PN} += "${datadir}/*"
