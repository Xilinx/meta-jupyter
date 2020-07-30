inherit pypi setuptools3

SRC_URI[md5sum] = "f012668907d76cebe9c4766f3b806fcf"
SRC_URI[sha256sum] = "86ed7d9b750603e4ba582ea8edc678657fb4007894a12bcf6f4bb97892f31d20"

SUMMARY = "JEDI: An autocompletion tool for Python that can be used for text editors"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=10;endline=10;md5=8227180126797a0148f94f483f3e1489"

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-parso \
        ${PYTHON_PN}-logging \
        ${PYTHON_PN}-pkgutil \
        "
