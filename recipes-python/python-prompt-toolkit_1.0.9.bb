SUMMARY = "Library for building powerful interactive command lines in Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=23f9ad5cad3d8cc0336e2a5d8a87e1fa"

SRC_URI[md5sum] = "a39f91a54308fb7446b1a421c11f227c"
SRC_URI[sha256sum] = "cd6523b36adc174cc10d54b1193eb626b4268609ff6ea92c15bcf1996609599c"

PYPI_PACKAGE = "prompt_toolkit"

RDEPENDS_${PN} += " \
	python-six \
	python-wcwidth \
	"


inherit pypi setuptools
