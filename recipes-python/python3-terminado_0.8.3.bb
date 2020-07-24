inherit pypi setuptools3

SUMMARY = "Terminals served to term.js using Tornado websockets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42528797bebcb0e6818398531707415d"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-ptyprocess \
        ${PYTHON_PN}-tornado \
        "

SRC_URI[md5sum] = "910a09be2a9d46ddbf33747d1b1dd3d8"
SRC_URI[sha256sum] = "4804a774f802306a7d9af7322193c5390f1da0abb429e082a10ef1d46e6fb2c2"
