SUMMARY = "A vuetify template for Voila"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f640de5518dab925d3378cc1f684b89c"

SRC_URI[sha256sum] = "63f7da1efb2a48df44206da2504b70adf549279d572046e2d04adcc57e5b6f66"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
	python3-ipyvuetify \
	python3-voila \
	"

FILES:${PN} += "${datadir}/*"
