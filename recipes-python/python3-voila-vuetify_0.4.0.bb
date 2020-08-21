SUMMARY = "A vuetify template for Voila"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f640de5518dab925d3378cc1f684b89c"

SRC_URI[sha256sum] = "2378c8e207df7f4de67385bf3fb489c1a45a347271fec21c813393c00492ff67"

inherit pypi setuptools3

RDEPENDS_${PN} += " \
	python3-ipyvuetify \
	python3-voila \
	"

FILES_${PN} += "${datadir}/*"
