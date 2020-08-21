SUMMARY = "Jupyter widgets based on vuetify UI components"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bfa60affe90b77609b1b4f2143e5c766"

SRC_URI[sha256sum] = "5c311308d3ec9c92e48ab6ca021b5b51295e9e39de640f69827e30d5f03a244b"

inherit pypi setuptools3

RDEPENDS_${PN} += "python3-ipyvue"

FILES_${PN} += "${datadir}/*"
