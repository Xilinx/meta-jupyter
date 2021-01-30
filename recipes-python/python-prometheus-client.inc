SUMMARY = "Python client for the Prometheus monitoring system"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=590a3fe69dec1ae6d5f4e74171c4ff0f"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-netserver \
	"

PYPI_PACKAGE = "prometheus_client"
