SUMMARY = "ipywidgets, also known as jupyter-widgets or simply widgets, are interactive HTML widgets for Jupyter notebooks and the IPython kernel."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

SRC_URI[sha256sum] = "61f969306b95f85fba6b6986b7fe45d73124d1d9e3023a8068710d47a22ea668"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = " \
	python3-comm \
	python3-core \
	python3-ipython \
	python3-jupyterlab-widgets \
	python3-traitlets \
	python3-widgetsnbextension \
	"

BBCLASSEXTEND = "native"
