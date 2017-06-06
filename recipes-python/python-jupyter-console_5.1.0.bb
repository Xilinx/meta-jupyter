SUMMARY = "Jupyter notebook"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "20eff10b4cd93f081207bfa0cc5a3b0e"
SRC_URI[sha256sum] = "d0b4ae4dfe070be1e9d5690fa819328acffb5f37a8ef3baa1c7e3b77b443cfd7"

RDEPENDS_${PN} += " \
	python-ipykernel \
	python-ipython \
	python-jupyter-client \
	python-pygments \
	python-prompt-toolkit \
	"
	
PYPI_PACKAGE = "jupyter_console"

inherit pypi setuptools
