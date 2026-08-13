SUMMARY = "Tornado websocket backend for the Xterm.js Javascript terminal emulator library."
HOMEPAGE = "https://github.com/jupyter/terminado"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a660754490a9b006d8b2659ac0a7b50d"


SRC_URI[sha256sum] = "de09f2c4b85de4765f7714688fff57d3e75bad1f909b589fde880460c753fd2e"

inherit pypi python_hatchling

RDEPENDS:${PN} = " \
	python3-ptyprocess \
	python3-tornado \
	"

BBCLASSEXTEND = "native"
