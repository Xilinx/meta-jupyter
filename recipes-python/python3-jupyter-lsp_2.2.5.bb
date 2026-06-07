SUMMARY = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${UNPACKDIR}/jupyter-lsp-${PV}/LICENSE;md5=7c4ff345ebb091fcbc5290142e324da5"

SRC_URI[sha256sum] = "793147a05ad446f809fd53ef1cd19a9f5256fd0a2d6b7ce943a982cb4f545001"

PYPI_SRC_URI = "https://files.pythonhosted.org/packages/source/j/jupyter_lsp/jupyter-lsp-${PV}.tar.gz"
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
	python3-logging \
	python3-netclient \
	python3-stringold \
	python3-tornado \
	python3-traitlets \
	python3-typing-extensions \
	"

BBCLASSEXTEND = "native"
