inherit pypi setuptools3

SUMMARY = "Object-oriented filesystem paths"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

BBCLASSEXTEND = "native"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-six \
        ${PYTHON_PN}-scandir \
        "
SRC_URI[sha256sum] = "7d8bcb5555003cdf4a8d2872c538faa3a0f5d20630cb360e518ca3b981795e5f"
