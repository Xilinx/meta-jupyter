SUMMARY = "Jupyter Qt console"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "c08ebebc7a60629ebadf685361ca0798"
SRC_URI[sha256sum] = "25ec7d345528b3e8f3c91be349dd3c699755f206dc4b6ec668e2e5dd60ea18ef"

RDEPENDS_${PN} += " \
	python-ipykernel \
	python-jupyter-core \
	python-jupyter-client \
	python-traitlets \
	python-pygments \
	"


inherit pypi setuptools
