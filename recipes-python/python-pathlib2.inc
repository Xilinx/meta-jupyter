SUMMARY = "Object-oriented filesystem paths"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-six \
	${PYTHON_PN}-scandir \
	"
