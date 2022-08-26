SUMMARY = "JupyterLab Server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=23f9ad5cad3d8cc0336e2a5d8a87e1fa"

PYPI_PACKAGE = "jupyterlab_server"
PN="${PYTHON_PN}-jupyterlab-server"

inherit pypi python_setuptools_build_meta

DEPENDS += " \
       ${PYTHON_PN}-jupyter-server-native \
       ${PYTHON_PN}-anyio-native \
       ${PYTHON_PN}-sniffio-native \
       ${PYTHON_PN}-websocket-client-native \
"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-notebook \
        ${PYTHON_PN}-jsonschema \
        "

SRC_URI[sha256sum] = "2040298a133458aa22f287a877d6bb91ff973f6298d562264f9f7b75e92a5ace"

RDEPENDS:${PN} += "${PYTHON_PN}-json5"
