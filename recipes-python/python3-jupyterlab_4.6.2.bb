SUMMARY = "JupyterLab computational environment"
HOMEPAGE = "https://jupyter.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=83bb5186939851701e10cd968bf56607"

DEPENDS = " \
	python3-hatchling-native \
	python3-hatch-jupyter-builder-native \
	python3-jupyter-builder-native \
	"

SRC_URI[sha256sum] = "e18ce8b34f3de350e93cd5b2c4f3ae884cbe266eb76bf5d6825a4ed34c13bcff"

inherit pypi python_hatchling mime-xdg

FILES:${PN} += " \
	${datadir} \
	${prefix}/etc/jupyter \
	"

RDEPENDS:${PN} = " \
	python3-async-lru \
	python3-defusedxml \
	python3-httpx \
	python3-importlib-metadata \
	python3-ipykernel \
	python3-ipywidgets \
	python3-jinja2 \
	python3-jupyter-builder \
	python3-jupyter-console \
	python3-jupyter-core \
	python3-jupyter-lsp \
	python3-jupyter-server \
	python3-jupyterlab-pygments \
	python3-jupyterlab-server \
	python3-jupyterlab-widgets \
	python3-notebook-shim \
	python3-packaging \
	python3-setuptools \
	python3-tomli \
	python3-tornado \
	python3-traitlets \
	python3-xmlrpc \
"

BBCLASSEXTEND = "native"
