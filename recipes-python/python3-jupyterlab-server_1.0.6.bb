inherit pypi setuptools3

SUMMARY = "JupyterLab Server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

PYPI_PACKAGE = "jupyterlab_server"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-notebook \
        ${PYTHON_PN}-jsonschema \
        "

SRC_URI[md5sum] = "84215e737b8f8f92e0747890fb4ae385"
SRC_URI[sha256sum] = "d0977527bfce6f47c782cb6bf79d2c949ebe3f22ac695fa000b730c671445dad" 
RDEPENDS_${PN} += "${PYTHON_PN}-json5"
