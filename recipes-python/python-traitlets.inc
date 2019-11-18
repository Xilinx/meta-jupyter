SUMMARY = "Traitlets Python config system"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-six \
	${PYTHON_PN}-decorator \
	${PYTHON_PN}-ipython-genutils \
	"

BBCLASSEXTEND = "native"
