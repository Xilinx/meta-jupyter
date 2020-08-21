SUMMARY = "Async generators and context managers for Python 3.5+"
LICENSE = "MIT & Apache-2.0"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=e7e2c6a927fea60b7e93d1c53ab6c43b \
	file://LICENSE.APACHE2;md5=3b83ef96387f14655fc854ddc3c6bd57 \
	file://LICENSE.MIT;md5=e62ba5042d5983462ad229f5aec1576c \
	"

PYPI_PACKAGE = "async_generator"

inherit pypi setuptools3

SRC_URI[sha256sum] = "6ebb3d106c12920aaae42ccb6f787ef5eefdcdd166ea3d628fa8476abe712144"
