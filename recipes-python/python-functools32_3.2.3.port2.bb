SUMMARY = "Backport of the functools module from Python 3.2.3 for use on 2.7 and PyPy."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=a88fbad12eb909375ed2882ba5664aeb"

SRC_URI[md5sum] = "d55232eb132ec779e6893c902a0bc5ad"
SRC_URI[sha256sum] = "89d824aa6c358c421a234d7f9ee0bd75933a67c29588ce50aaa3acdf4d403fa0"

PV = "3.2.3-2"

PYPI_PACKAGE_EXT = "zip"

inherit pypi setuptools
