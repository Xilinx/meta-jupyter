inherit pypi setuptools3

SUMMARY = "parso: A Python Parse"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cbaa2675b2424d771451332a7a69503f"

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-logging \
        ${PYTHON_PN}-difflib \
        "

SRC_URI[md5sum] = "eac40cda515ee71e3bb008c404ca3ac1"
SRC_URI[sha256sum] = "caba44724b994a8a5e086460bb212abc5a8bc46951bf4a9a1210745953622eb9"
