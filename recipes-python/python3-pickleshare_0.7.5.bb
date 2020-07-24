inherit pypi setuptools3

SUMMARY = "Tiny 'shelve'-like database with concurrency support"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-pathlib2 \
        "

SRC_URI[md5sum] = "44ab782615894a812ab96669a122a634"
SRC_URI[sha256sum] = "87683d47965c1da65cdacaf31c8441d12b8044cdec9aca500cd78fc2c683afca"
