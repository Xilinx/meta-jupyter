inherit pypi setuptools3

SUMMARY = "Jupyter Widgets JupyterLab Extension"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=8f4ed468cfaf9b7607da1aa5b55d242c"

PYPI_PACKAGE="jupyterlab-widgets"
PN="python3-jupyterlab_widgets"

S="${WORKDIR}/jupyterlab_widgets-${PV}"
DEPENDS+= " \
	${PYTHON_PN}-jupyter_packaging-native \
"

SRC_URI="https://files.pythonhosted.org/packages/25/f8/b75cd85c63c2a9a6ea0ee248c7b2a6d46f942fcfcac0555cc53ed86ae320/jupyterlab_widgets-1.0.0.tar.gz"
SRC_URI[md5sum] = "e06d15a0b04bd0c9a24b57cfc7b27227"
SRC_URI[sha256sum] = "5c1a29a84d3069208cb506b10609175b249b6486d6b1cbae8fcde2a11584fb78"

FILES_${PN} += "/usr/share/jupyter/labextensions"
