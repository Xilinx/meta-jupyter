SUMMARY = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bfa60affe90b77609b1b4f2143e5c766"

SRC_URI[sha256sum] = "fa8ff9b9a73b5a925c4af4c05f1839df2bd0fae0063871f403ee821792d5ab72"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-ipywidgets"

FILES:${PN} += "${datadir}/*"
