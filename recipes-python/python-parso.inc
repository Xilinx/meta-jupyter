SUMMARY = "parso: A Python Parse"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cbaa2675b2424d771451332a7a69503f"

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-logging \
	${PYTHON_PN}-difflib \
	"
