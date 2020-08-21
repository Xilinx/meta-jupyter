SUMMARY = "Jupyter widgets base for Vue libraries"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bfa60affe90b77609b1b4f2143e5c766"

SRC_URI[sha256sum] = "3253727e8e12e3c157550e3e8d6986edf61ad0d68299992fbf3fa6acec41a12e"

inherit pypi setuptools3

RDEPENDS_${PN} += "python3-ipywidgets"

FILES_${PN} += "${datadir}/*"
