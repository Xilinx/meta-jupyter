inherit pypi setuptools3

SUMMARY = "Traitlets Python config system"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-six \
        ${PYTHON_PN}-decorator \
        ${PYTHON_PN}-ipython-genutils \
        ${PYTHON_PN}-json \
        "

BBCLASSEXTEND = "native"

SRC_URI[md5sum] = "3a4f263af65d3d79f1c279f0247077ef"
SRC_URI[sha256sum] = "d023ee369ddd2763310e4c3eae1ff649689440d4ae59d7485eb4cfbbe3e359f7"
