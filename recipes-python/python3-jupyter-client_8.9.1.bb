SUMMARY = "Jupyter protocol implementation and client libraries"
HOMEPAGE = "https://jupyter.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=083556a9912a35360dae8281fb57e886"

SRC_URI[sha256sum] = "a58f730dd9e728ba16ba1d62ebccf7ffe1ebbdbce4e95cfae941b7321ae1f4fa"

PYPI_PACKAGE = "jupyter_client"
inherit pypi python_hatchling

RDEPENDS:${PN} = " \
	python3-core \
	python3-dateutil \
	python3-importlib-metadata \
	python3-jupyter-core \
	python3-pyzmq \
	python3-tornado \
	python3-traitlets \
	python3-typing-extensions \
"

BBCLASSEXTEND = "native"
