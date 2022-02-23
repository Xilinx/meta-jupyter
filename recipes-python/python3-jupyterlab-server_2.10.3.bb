SUMMARY = "JupyterLab Server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=23f9ad5cad3d8cc0336e2a5d8a87e1fa"

PYPI_PACKAGE = "jupyterlab_server"
PN="python3-jupyterlab_server"

inherit pypi setuptools3

DEPENDS += " \
       python3-jupyter_server-native \
       python3-anyio-native \
       python3-sniffio-native \
       python3-websocket-client-native \
"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-notebook \
        ${PYTHON_PN}-jsonschema \
        "

SRC_URI[sha256sum] = "3fb84a5813d6d836ceda773fb2d4e9ef3c7944dbc1b45a8d59d98641a80de80a"

RDEPENDS:${PN} += "${PYTHON_PN}-json5"
