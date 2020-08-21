SUMMARY = "Scipy trait types"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9a74a4a6983a9e566741b5e42ec8c0c0"

PYPI_PACKAGE = "traittypes"

inherit pypi setuptools3

SRC_URI[sha256sum] = "be6fa26294733e7489822ded4ae25da5b4824a8a7a0e0c2dccfde596e3489bd6"

RDEPENDS_${PN} += "python3-traitlets"
