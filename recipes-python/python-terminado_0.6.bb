SUMMARY = "Terminals served to term.js using Tornado websockets"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=23f9ad5cad3d8cc0336e2a5d8a87e1fa"

#SRC_URI[md5sum] = "25142b08e2ad7142b6f920bc8cc8dfeb"
SRC_URI[sha256sum] = "2c0ba1f624067dccaaead7d2247cfe029806355cef124dc2ccb53c83229f0126"

RDEPENDS_${PN} += " \
	python-ptyprocess \
	python-tornado \
	"


inherit pypi setuptools
