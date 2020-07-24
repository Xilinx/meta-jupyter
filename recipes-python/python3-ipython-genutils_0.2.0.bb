inherit pypi setuptools3

SUMMARY = "Vestigial utilities from IPython"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=f7c3032c3ac398265224533a0a333a35"

SRC_URI[sha256sum] = "eb2e116e75ecef9d4d228fdc66af54269afa26ab4463042e33785b887c628ba8"

PYPI_PACKAGE = "ipython_genutils"

BBCLASSEXTEND = "native"
