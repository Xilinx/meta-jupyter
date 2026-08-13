SUMMARY = "Jupyter Notebook - A web-based notebook environment for interactive computing"
HOMEPAGE = "https://github.com/jupyter/notebook"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=083556a9912a35360dae8281fb57e886"

DEPENDS += " \
	python3-hatch-jupyter-builder-native \
	python3-jupyter-builder-native \
	"

SRC_URI[sha256sum] = "0b45fd1010668dd4808c40914d957706dbf044a677d28764dc881b74dfcede82"

PYPI_PACKAGE = "notebook"
inherit pypi python_hatchling mime-xdg

# the sdist ships the prebuilt JS assets
export SKIP_JUPYTER_BUILDER = "1"

# keep in step with ensured-targets in pyproject.toml
JUPYTER_ENSURED_TARGETS = " \
	notebook/labextension/static/style.js \
"

do_configure:append() {
    for target in ${JUPYTER_ENSURED_TARGETS}; do
        if [ ! -f ${S}/$target ]; then
            bbfatal "$target is missing from the sdist, so the JavaScript" \
                    "assets would have to be built here"
        fi
    done
}

FILES:${PN} += "${prefix}"

RDEPENDS:${PN} = " \
	python3-jupyter-builder \
	python3-jupyter-server \
	python3-jupyterlab \
	python3-jupyterlab-server \
	python3-notebook-shim \
	python3-tornado \
	"
