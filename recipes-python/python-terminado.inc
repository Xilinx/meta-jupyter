SUMMARY = "Terminals served to term.js using Tornado websockets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42528797bebcb0e6818398531707415d"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-ptyprocess \
	${PYTHON_PN}-tornado \
	"
