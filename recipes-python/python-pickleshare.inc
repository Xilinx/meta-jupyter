SUMMARY = "Tiny 'shelve'-like database with concurrency support"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-pathlib2 \
	"
