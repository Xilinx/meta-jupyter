SUMMARY = "Jupyter Notebook - A web-based notebook environment for interactive computing"
HOMEPAGE = "https://github.com/jupyter/notebook"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=083556a9912a35360dae8281fb57e886"

DEPENDS += " \
	python3-hatchling-native \
	python3-hatch-jupyter-builder-native \
	python3-argon2-cffi-bindings-native \
	python3-charset-normalizer-native \
	python3-hatchling-native \
	python3-jupyterlab-native \
	python3-jupyterlab-pygments-native \
	python3-jsonschema-native \
	"

SRC_URI[sha256sum] = "4287b6da59740b32173d01d641f763d292f49c30e7a51b89c46ba8473126341e"

PYPI_PACKAGE = "notebook"
inherit pypi python_hatchling mime-xdg

FILES:${PN} += "${prefix}"

RDEPENDS:${PN} = " \
	python3-jupyter-server \
	python3-jupyterlab \
	python3-jupyterlab-server \
	python3-notebook-shim \
	python3-tornado \
	"
