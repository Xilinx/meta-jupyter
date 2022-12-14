SUMMARY = "JupyterLab extension for Jupyter/IPython widgets."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46c4b25eb11307c56dc6205528a80fb0"

SRC_URI[sha256sum] = "c1de08193c29a3f0e73e4e8f3e04eb72d1e39dd417407974d55477e8d4421c78"
PYPI_PACKAGE = "jupyterlab_widgets"

inherit pypi setuptools3

DEPENDS += " \
    ${PYTHON_PN}-jupyter-packaging-native \
    "

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-jupyter-packaging \
    "

FILES:${PN} += " \
    ${datadir}/jupyter/labextensions \
    "