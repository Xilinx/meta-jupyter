SUMMARY = "Retrying"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

PYPI_PACKAGE = "retrying"

inherit pypi setuptools3

SRC_URI[sha256sum] = "08c039560a6da2fe4f2c426d0766e284d3b736e355f8dd24b37367b0bb41973b"

RDEPENDS_${PN} += "python3-six"
