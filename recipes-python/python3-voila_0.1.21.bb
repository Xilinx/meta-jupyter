SUMMARY = "Rendering of live jupyter notebooks with interactive widgets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ae6230e5f517c55a7e8c431c0d488ed0"

SRC_URI[sha256sum] = "6ee4c63b3c27f96305fe6e023f22f6edf77eba1335167edfdf3a2a9c6d2459ab"

inherit pypi setuptools3

RDEPENDS_${PN} += " \
	python3-async-generator \
	python3-jupyter_server \
	python3-nbconvert \
	python3-jupyterlab-pygments \
	python3-pygments \
	"

FILES_${PN} += "${datadir}/*"
