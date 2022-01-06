SUMMARY = "An open-source, interactive data visualization library for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c7b311a6fbf8f1e2f22c16e2ad556f98"

PYPI_PACKAGE = "plotly"

inherit pypi setuptools3

SRC_URI[sha256sum] = "20b8a1a0f0434f9b8d10eb7caa66e947a9a1d698e5a53d40d447bbc0d2ae41f0"

RDEPENDS:${PN} += " \
	python3-retrying \
	python3-six \
	"

FILES:${PN} += "${datadir}/*"
