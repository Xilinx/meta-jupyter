inherit pypi setuptools3

SUMMARY = "Jupyter Widgets JupyterLab Extension"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f4ed468cfaf9b7607da1aa5b55d242c"

PYPI_PACKAGE="jupyterlab-widgets"
PN="python3-jupyterlab_widgets"

S="${WORKDIR}/jupyterlab_widgets-${PV}"
DEPENDS+= " \
	${PYTHON_PN}-jupyter_packaging-native \
"

PYPI_SRC_URI="https://files.pythonhosted.org/packages/27/f1/0d3a09c0069467ed9636faf3a9b5b758378216bb891066a0bc24799681e3/jupyterlab_widgets-1.0.2.tar.gz"
SRC_URI[md5sum] = "0549460f3717942451a3e51bb2f1afd9"
SRC_URI[sha256sum] = "7885092b2b96bf189c3a705cc3c412a4472ec5e8382d0b47219a66cccae73cfa"

FILES:${PN} += "/usr/share/jupyter/labextensions"
