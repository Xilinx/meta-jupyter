SUMMARY = "JupyterLab Server"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=23f9ad5cad3d8cc0336e2a5d8a87e1fa"

SRC_URI[sha256sum] = "2040298a133458aa22f287a877d6bb91ff973f6298d562264f9f7b75e92a5ace"
PYPI_PACKAGE = "jupyterlab_server"

inherit pypi setuptools3

DEPENDS += " \
    ${PYTHON_PN}-jupyter-server-native \
    ${PYTHON_PN}-anyio-native \
    ${PYTHON_PN}-sniffio-native \
    ${PYTHON_PN}-websocket-client-native \
    "

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-notebook \
    ${PYTHON_PN}-jsonschema \
    ${PYTHON_PN}-json5 \
    "