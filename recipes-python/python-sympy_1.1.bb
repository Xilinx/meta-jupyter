DESCRIPTION = "SymPy is a Python library for symbolic mathematics. It aims to become a full-featured computer algebra system (CAS) while keeping the code as simple as possible in order to be comprehensible and easily extensible. SymPy is written entirely in Python. It depends on mpmath, and other external libraries may be optionally for things like plotting support."
HOMEPAGE = "http://sympy.org/"
SUMMARY = "Computer algebra system (CAS) in Python"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

PYPI_PACKAGE = "sympy"

SRC_URI[md5sum] = "e1b7a2b14066fc99c1cf22cedba56be8"
SRC_URI[sha256sum] = "e42d7b8cc719bb0427b503d49f8489ec6292c74957c3bd04216a8392bee37782"

inherit pypi setuptools

RDEPENDS_${PN} += " \
	python-mpmath \
	"

