inherit pypi setuptools3

DESCRIPTION = "SymPy is a Python library for symbolic mathematics. It aims to become a full-featured computer algebra system (CAS) while keeping the code as simple as possible in order to be comprehensible and easily extensible. SymPy is written entirely in Python. It depends on mpmath, and other external libraries may be optionally for things like plotting support."
HOMEPAGE = "http://sympy.org/"
SUMMARY = "Computer algebra system (CAS) in Python"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ebb06e9df8f57522b72d0edb0fcf83d4"

PYPI_PACKAGE = "sympy"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-mpmath \
        "

SRC_URI[md5sum] = "8bdf8473751722fd1714aa7125b1478b"
SRC_URI[sha256sum] = "7386dba4f7e162e90766b5ea7cab5938c2fe3c620b310518c8ff504b283cb15b"
