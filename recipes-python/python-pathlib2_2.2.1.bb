SUMMARY = "Object-oriented filesystem paths"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

SRC_URI[md5sum] = "6c75bfde898b6c88627621a48ee8de14"
SRC_URI[sha256sum] = "ce9007df617ef6b7bd8a31cd2089ed0c1fed1f7c23cf2bf1ba140b3dd563175d"

RDEPENDS_${PN} += " \
	python-six \
	python-scandir \
	"

inherit pypi setuptools
