inherit pypi setuptools3

SRC_URI[md5sum] = "ba88266caac41988ffb4fd6041a3c354"
SRC_URI[sha256sum] = "ba859c74fa3c966a22f2aeebe1b74ee27e2a462f56d3f5f7ca4a59af61bfe42e"

SUMMARY = "JEDI: An autocompletion tool for Python that can be used for text editors"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=10;endline=10;md5=8227180126797a0148f94f483f3e1489"

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-parso \
        ${PYTHON_PN}-logging \
        ${PYTHON_PN}-pkgutil \
        "
