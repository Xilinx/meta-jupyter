SUMMARY = "JEDI: An autocompletion tool for Python that can be used for text editors"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=10;endline=10;md5=8227180126797a0148f94f483f3e1489"

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-parso \
	${PYTHON_PN}-logging \
	${PYTHON_PN}-pkgutil \
	"
