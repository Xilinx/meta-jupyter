SUMMARY = "An easy safelist-based HTML-sanitizing tool."
LICENSE = "Apache-1.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=2806187b75d35ffc62449d9a73cb24a1"

SRC_URI[md5sum] = "a263ed1c7b16ea10d3b20278852b65d7"
SRC_URI[sha256sum] = "b9522130003e4caedf4f00a39c120a906dcd4242329c1c8f621f5370203cbc30"

PYPI_PACKAGE = "bleach"

RDEPENDS_${PN} += " \
	python-six \
	python-html5lib \
	"


inherit pypi setuptools
