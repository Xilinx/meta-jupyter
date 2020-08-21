SUMMARY = "An open-source, interactive data visualization library for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c7b311a6fbf8f1e2f22c16e2ad556f98"

PYPI_PACKAGE = "plotly"

inherit pypi setuptools3

SRC_URI[sha256sum] = "257f530ffd73754bd008454826905657b329053364597479bb9774437a396837"

RDEPENDS_${PN} += " \
	python3-retrying \
	python3-six \
	"

FILES_${PN} += "${datadir}/*"
