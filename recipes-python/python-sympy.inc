DESCRIPTION = "SymPy is a Python library for symbolic mathematics. It aims to become a full-featured computer algebra system (CAS) while keeping the code as simple as possible in order to be comprehensible and easily extensible. SymPy is written entirely in Python. It depends on mpmath, and other external libraries may be optionally for things like plotting support."
HOMEPAGE = "http://sympy.org/"
SUMMARY = "Computer algebra system (CAS) in Python"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=611b41534dbf5aa01d7c827bf667ef66"

PYPI_PACKAGE = "sympy"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-mpmath \
	"
