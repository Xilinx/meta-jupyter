SUMMARY = "A backport of the get_terminal_size function from Python 3.3's shutil."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

SRC_URI[md5sum] = "03267762480bd86b50580dc19dff3c66"
SRC_URI[sha256sum] = "713e7a8228ae80341c70586d1cc0a8caa5207346927e23d09dcbcaf18eadec80"

PYPI_PACKAGE = "backports.shutil_get_terminal_size"

inherit pypi setuptools
