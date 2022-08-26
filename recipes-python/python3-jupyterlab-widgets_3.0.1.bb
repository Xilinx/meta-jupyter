inherit pypi python_setuptools_build_meta

SUMMARY = "Jupyter Widgets JupyterLab Extension"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46c4b25eb11307c56dc6205528a80fb0"

PYPI_PACKAGE="jupyterlab_widgets"
PN="python3-jupyterlab-widgets"

S="${WORKDIR}/jupyterlab_widgets-${PV}"

DEPENDS+= " \
	${PYTHON_PN}-jupyter-packaging-native \
"

SRC_URI[sha256sum] = "c1de08193c29a3f0e73e4e8f3e04eb72d1e39dd417407974d55477e8d4421c78"

FILES:${PN} += "/usr/share/jupyter/labextensions"
