SUMMARY = "An easy safelist-based HTML-sanitizing tool."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=adea50d072dac455e5a50a518e2d01aa"

SRC_URI[md5sum] = "a263ed1c7b16ea10d3b20278852b65d7"
SRC_URI[sha256sum] = "b9522130003e4caedf4f00a39c120a906dcd4242329c1c8f621f5370203cbc30"

PYPI_PACKAGE = "bleach"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-six \
	${PYTHON_PN}-html5lib \
	"
