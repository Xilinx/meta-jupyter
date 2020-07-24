inherit pypi setuptools3

DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication quality figures in a variety of hardcopy formats "
SECTION = "devel/python"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://LICENSE/LICENSE;md5=afec61498aa5f0c45936687da9a53d74"

DEPENDS += " \
        ${PYTHON_PN}-numpy-native \
        freetype \
        libpng \
        ${PYTHON_PN}-dateutil \
        ${PYTHON_PN}-pytz \
        ${PYTHON_PN}-kiwisolver \
        "

RDEPENDS_${PN} = " \
        ${PYTHON_PN}-core \
        ${PYTHON_PN}-distutils \
        ${PYTHON_PN}-numpy \
        freetype \
        libpng \
        ${PYTHON_PN}-dateutil \
        ${PYTHON_PN}-pytz \
        ${PYTHON_PN}-cycler \
        ${PYTHON_PN}-kiwisolver \
        ${PYTHON_PN}-pyparsing \
        "
PYPI_PACKAGE = "matplotlib"

SRC_URI[md5sum] = "f894af5564a588e880644123237251b7"
SRC_URI[sha256sum] = "1febd22afe1489b13c6749ea059d392c03261b2950d1d45c17e3aed812080c93"
