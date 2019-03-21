SUMMARY = "Python client for the Prometheus monitoring system"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=590a3fe69dec1ae6d5f4e74171c4ff0f"

SRC_URI[sha256sum] = "e8c11ff5ca53de6c3d91e1510500611cafd1d247a937ec6c588a0a7cc3bef93c"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-netserver \
	"

PYPI_PACKAGE = "prometheus_client"
