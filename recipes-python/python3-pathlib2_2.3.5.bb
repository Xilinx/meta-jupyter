inherit pypi setuptools3

SUMMARY = "Object-oriented filesystem paths"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-six \
        ${PYTHON_PN}-scandir \
        "
SRC_URI[md5sum] = "f2bd0a363eb0f8fa0556f35c1d9e66fb"
SRC_URI[sha256sum] = "6cd9a47b597b37cc57de1c05e56fb1a1c9cc9fab04fe78c29acd090418529868"
