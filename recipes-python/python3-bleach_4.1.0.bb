inherit pypi setuptools3

SUMMARY = "An easy safelist-based HTML-sanitizing tool."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=adea50d072dac455e5a50a518e2d01aa"

SRC_URI[sha256sum] = "0900d8b37eba61a802ee40ac0061f8c2b5dee29c1927dd1d233e075ebf5a71da"

PYPI_PACKAGE = "bleach"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-six \
        ${PYTHON_PN}-webencodings \
        ${PYTHON_PN}-packaging \
        bash \
        "

BBCLASSEXTEND = "native"
