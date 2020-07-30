inherit pypi setuptools3

SUMMARY = "XML bomb protection for Python stdlib modules"
LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=056fea6a4b395a24d0d278bf5c80249e"

SRC_URI[sha256sum] = "f684034d135af4c6cbb949b8a4d2ed61634515257a67299e5f940fbaa34377f5"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-xml \
        "

