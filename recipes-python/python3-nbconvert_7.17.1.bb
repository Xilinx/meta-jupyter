SUMMARY = "Converting Jupyter Notebooks (.ipynb files) to other formats."
HOMEPAGE = "https://jupyter.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=083556a9912a35360dae8281fb57e886"

DEPENDS = "python3-hatchling-native"
SRC_URI[sha256sum] = "34d0d0a7e73ce3cbab6c5aae8f4f468797280b01fd8bd2ca746da8569eddd7d2"

inherit pypi python_hatchling

FILES:${PN} += "${datadir}"

RDEPENDS:${PN} = " \
	python3-beautifulsoup4 \
	python3-bleach \
	python3-defusedxml \
	python3-importlib-metadata \
	python3-jinja2 \
	python3-jupyter-core \
	python3-jupyterlab-pygments \
	python3-markupsafe \
	python3-mistune \
	python3-nbclient \
	python3-nbformat \
	python3-packaging \
	python3-pandocfilters \
	python3-pygments \
	python3-tinycss2 \
	python3-traitlets \
	"

BBCLASSEXTEND = "native"
