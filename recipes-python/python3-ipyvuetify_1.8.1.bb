SUMMARY = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bfa60affe90b77609b1b4f2143e5c766"

SRC_URI[sha256sum] = "2d17367ce7da45a2622107d55c8b4c5475aace99ed5d95e5d7d3f93aa4c0c566"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-ipyvue"

FILES:${PN} += "${datadir}/*"
