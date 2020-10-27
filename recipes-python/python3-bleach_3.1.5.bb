inherit pypi setuptools3

SUMMARY = "An easy safelist-based HTML-sanitizing tool."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=adea50d072dac455e5a50a518e2d01aa"

SRC_URI[md5sum] = "63cae08551307156ec636465aff5183e"
SRC_URI[sha256sum] = "3c4c520fdb9db59ef139915a5db79f8b51bc2a7257ea0389f30c846883430a4b"

PYPI_PACKAGE = "bleach"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-six \
        ${PYTHON_PN}-webencodings \
        ${PYTHON_PN}-packaging \
        bash \
        "

