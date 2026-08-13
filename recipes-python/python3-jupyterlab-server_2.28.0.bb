SUMMARY = "A set of server components for JupyterLab and JupyterLab like applications."
HOMEPAGE = "https://jupyterlab-server.readthedocs.io"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=16b24abb4aef09551533365c88c785cf"

SRC_URI[sha256sum] = "35baa81898b15f93573e2deca50d11ac0ae407ebb688299d3a5213265033712c"

PYPI_PACKAGE = "jupyterlab_server"
inherit pypi python_hatchling

RDEPENDS:${PN} = " \
	python3-babel \
	python3-importlib-metadata \
	python3-jinja2 \
	python3-json5 \
	python3-jsonschema \
	python3-jupyter-server \
	python3-packaging \
	python3-requests \
	"

BBCLASSEXTEND = "native"
