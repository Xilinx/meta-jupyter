inherit pypi setuptools3

SUMMARY = "JupyterLab Server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

PYPI_PACKAGE = "jupyterlab_server"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-notebook \
        ${PYTHON_PN}-jsonschema \
        "

SRC_URI[md5sum] = "4900ee7278fbb159a67bbdc7c93b0a66"
SRC_URI[sha256sum] = "5431d9dde96659364b7cc877693d5d21e7b80cea7ae3959ecc2b87518e5f5d8c" 
RDEPENDS_${PN} += "${PYTHON_PN}-json5"
