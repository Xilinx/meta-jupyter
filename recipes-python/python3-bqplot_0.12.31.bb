SUMMARY = "Interactive plotting for the Jupyter notebook, using d3.js and \
	   ipywidgets."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=822b4ff4dd277d70fc2b796617ae1bf7"

PYPI_PACKAGE = "bqplot"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "cd880a84bd495ee5bf0687b496ddbc8049d2a9feff056f9343213e83e71737f7"

DEPENDS += " \
	${PYTHON_PN}-jupyter-packaging-native \
"
RDEPENDS:${PN} += " \
	${PYTHON_PN}-ipywidgets \
	${PYTHON_PN}-traitlets \
	${PYTHON_PN}-traittypes \
	${PYTHON_PN}-numpy \
	${PYTHON_PN}-pandas \
	"

do_install:append() {
	# this files will be installed by python3-json5
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/tests/__pycache__/__init__.cpython-37.pyc
}

FILES:${PN} += "${datadir}/*"

SKIP_RECIPE[python3-bqplot] ?= "python3 bplot is not used by packagegroup-python3-jupyter \
and more over this recipe does not build with kirkstone and landale release as \
it uses older version of python3-jupyter-packaging and other packages."