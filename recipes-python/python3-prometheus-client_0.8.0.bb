inherit pypi setuptools3

SUMMARY = "Python client for the Prometheus monitoring system"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=590a3fe69dec1ae6d5f4e74171c4ff0f"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-netserver \
        "

PYPI_PACKAGE = "prometheus_client"

SRC_URI[md5sum] = "5d03eac084b3a0d73a98fcb409c7fb0b"
SRC_URI[sha256sum] = "c6e6b706833a6bd1fd51711299edee907857be10ece535126a158f911ee80915"

