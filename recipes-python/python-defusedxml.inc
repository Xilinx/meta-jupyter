SUMMARY = "XML bomb protection for Python stdlib modules"
LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=056fea6a4b395a24d0d278bf5c80249e"

SRC_URI[sha256sum] = "24d7f2f94f7f3cb6061acb215685e5125fbcdc40a857eff9de22518820b0a4f4"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-xml \
	"
