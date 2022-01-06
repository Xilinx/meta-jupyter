SUMMARY = "Rendering of live jupyter notebooks with interactive widgets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8d47d42e4b7cca4a8d57b4547ec667a4"

SRC_URI[sha256sum] = "97ae429ca4b16a7a3fcf553d795b052ebe92d5db2113553a00b13e68eb4b7528"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
	python3-async-generator \
	python3-jupyter_server \
	python3-nbconvert \
	python3-jupyterlab-pygments \
	python3-pygments \
	"

FILES:${PN} += "${datadir}/*"
