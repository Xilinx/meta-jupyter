inherit pypi setuptools3

SUMMARY = "Terminals served to term.js using Tornado websockets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42528797bebcb0e6818398531707415d"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-ptyprocess \
        ${PYTHON_PN}-tornado \
        "

SRC_URI[sha256sum] = "b20fd93cc57c1678c799799d117874367cc07a3d2d55be95205b1a88fa08393f"
BBCLASSEXTEND = "native"
