SUMMARY = "Jupyter Python Comm implementation, for usage in ipykernel, xeus-python etc."
HOMEPAGE = "https://github.com/ipython/comm"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3a623b76c23287751590a7793a86e552"

DEPENDS = "python3-hatchling-native"
SRC_URI[sha256sum] = "2dc8048c10962d55d7ad693be1e7045d891b7ce8d999c97963a5e3e99c055971"

inherit pypi python_hatchling

RDEPENDS:${PN} = "python3-traitlets"

BBCLASSEXTEND = "native"
