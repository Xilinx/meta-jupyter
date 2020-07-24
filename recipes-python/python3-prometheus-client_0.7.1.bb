inherit pypi setuptools3

SUMMARY = "Python client for the Prometheus monitoring system"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=590a3fe69dec1ae6d5f4e74171c4ff0f"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-netserver \
        "

PYPI_PACKAGE = "prometheus_client"

SRC_URI[md5sum] = "3ce79ec28a913c2cb85269d9f9912282"
SRC_URI[sha256sum] = "71cd24a2b3eb335cb800c7159f423df1bd4dcd5171b234be15e3f31ec9f622da"

