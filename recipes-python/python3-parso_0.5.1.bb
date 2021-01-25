inherit pypi setuptools3

SUMMARY = "parso: A Python Parse"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cbaa2675b2424d771451332a7a69503f"

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-logging \
        ${PYTHON_PN}-difflib \
        "

SRC_URI[md5sum] = "cfdc0d7ce446ac3984cd7ef3e5850354"
SRC_URI[sha256sum] = "666b0ee4a7a1220f65d367617f2cd3ffddff3e205f3f16a0284df30e774c2a9c"
