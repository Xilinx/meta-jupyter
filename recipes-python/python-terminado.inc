SUMMARY = "Terminals served to term.js using Tornado websockets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42528797bebcb0e6818398531707415d"

SRC_URI[sha256sum] = "55abf9ade563b8f9be1f34e4233c7b7bde726059947a593322e8a553cc4c067a"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-ptyprocess \
	${PYTHON_PN}-tornado \
	"
