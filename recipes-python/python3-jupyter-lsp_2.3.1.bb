SUMMARY = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c4ff345ebb091fcbc5290142e324da5"

SRC_URI[sha256sum] = "fdf8a4aa7d85813976d6e29e95e6a2c8f752701f926f2715305249a3829805a6"

PYPI_PACKAGE = "jupyter_lsp"
inherit pypi setuptools3

FILES:${PN} += "${prefix}"

RDEPENDS:${PN} += " \
	python3-asyncio \
	python3-core \
	python3-ctypes \
	python3-datetime \
	python3-importlib-metadata \
	python3-io \
	python3-json \
	python3-jupyter-server \
	python3-logging \
	python3-netclient \
	python3-stringold \
	python3-tornado \
	python3-traitlets \
	python3-typing-extensions \
"

BBCLASSEXTEND = "native"
