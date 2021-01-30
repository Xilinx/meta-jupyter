SUMMARY = "An easy safelist-based HTML-sanitizing tool."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=adea50d072dac455e5a50a518e2d01aa"

SRC_URI[md5sum] = "fc8df989e0200a45f7a3a95ef9ee9854"
SRC_URI[sha256sum] = "3fdf7f77adcf649c9911387df51254b813185e32b2c6619f690b593a617e19fa"

PYPI_PACKAGE = "bleach"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-six \
	${PYTHON_PN}-html5lib \
	bash \
	"
