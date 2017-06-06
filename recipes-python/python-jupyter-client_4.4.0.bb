SUMMARY = "Jupyter protocol implementation and client libraries"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "8a428a07cbcd4f2e4ca7c2f728b718ea"
SRC_URI[sha256sum] = "c99a52fac2e5b7a3b714e9252ebf72cbf97536d556ae2b5082baccc3e5cd52ee"

RDEPENDS_${PN} += " \
	python-pyzmq \
	python-traitlets \
	python-jupyter-core \
	"

PYPI_PACKAGE = "jupyter_client"

inherit pypi setuptools
