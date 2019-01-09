SUMMARY = "An implementation of JSON Schema validation for Python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=8227180126797a0148f94f483f3e1489"

SRC_URI[md5sum] = "50c6b69a373a8b55ff1e0ec6e78f13f4"
SRC_URI[sha256sum] = "6ff5f3180870836cae40f06fa10419f557208175f13ad7bc26caa77beb1f6e02"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-functools32 \
	"
