inherit pypi setuptools3

SUMMARY = "Python client for the Prometheus monitoring system"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=590a3fe69dec1ae6d5f4e74171c4ff0f"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-netserver \
        "

PYPI_PACKAGE = "prometheus_client"

SRC_URI[md5sum] = "39c80f69a307e7d69917664e1e3046af"
SRC_URI[sha256sum] = "9da7b32f02439d8c04f7777021c304ed51d9ec180604700c1ba72a4d44dceb03"
