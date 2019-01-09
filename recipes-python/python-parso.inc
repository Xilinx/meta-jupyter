SUMMARY = "parso: A Python Parse"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cbaa2675b2424d771451332a7a69503f"

BBCLASSEXTEND = "native"
SRC_URI[sha256sum] = "35704a43a3c113cce4de228ddb39aab374b8004f4f2407d070b6a2ca784ce8a2"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-logging \
	${PYTHON_PN}-difflib \
	"
