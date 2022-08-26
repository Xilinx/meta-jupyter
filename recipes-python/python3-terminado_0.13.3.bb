inherit pypi python_setuptools_build_meta

SUMMARY = "Terminals served to term.js using Tornado websockets"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42528797bebcb0e6818398531707415d"

DEPENDS += "${PYTHON_PN}-tornado-native"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-ptyprocess \
        ${PYTHON_PN}-tornado \
        "

SRC_URI[sha256sum] = "94d1cfab63525993f7d5c9b469a50a18d0cdf39435b59785715539dd41e36c0d"
BBCLASSEXTEND = "native"
