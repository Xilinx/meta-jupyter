SUMMARY = "Interactive plotting for the Jupyter notebook, using d3.js and \
	   ipywidgets."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=822b4ff4dd277d70fc2b796617ae1bf7"

PYPI_PACKAGE = "bqplot"

inherit pypi setuptools3

SRC_URI[sha256sum] = "7205e53016f6991f64ae4423164c3e084e24b6e9d1f977bb2135ce9c7a017e4b"

RDEPENDS_${PN} += " \
	python3-ipywidgets \
	python3-traitlets \
	python3-traittypes \
	python3-numpy \
	python3-pandas \
	"

do_install_append() {
	# this files will be installed by python3-json5
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/tests/__pycache__/__init__.cpython-37.pyc
}

FILES_${PN} += "${datadir}/*"
