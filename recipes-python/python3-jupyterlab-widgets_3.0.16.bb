SUMMARY = "Jupyter interactive widgets for JupyterLab"
HOMEPAGE = "https://github.com/jupyter-widgets/ipywidgets"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46c4b25eb11307c56dc6205528a80fb0"

DEPENDS += " \
	python3-hatchling-native \
	python3-hatch-jupyter-builder-native \
	"

SRC_URI[sha256sum] = "423da05071d55cf27a9e602216d35a3a65a3e41cdf9c5d3b643b814ce38c19e0"

PYPI_PACKAGE = "jupyterlab_widgets"
inherit pypi python_hatchling

# the sdist ships the prebuilt labextension
export SKIP_JUPYTER_BUILDER = "1"

JUPYTER_ENSURED_TARGETS = "labextension/package.json"

do_configure:prepend() {
    sed -i -e 's/, *"jupyterlab[^"]*"//' ${S}/pyproject.toml
}

do_configure:append() {
    for target in ${JUPYTER_ENSURED_TARGETS}; do
        if [ ! -f ${S}/$target ]; then
            bbfatal "$target is missing from the sdist, so the JavaScript" \
                    "assets would have to be built here"
        fi
    done
}

FILES:${PN} += "${prefix}"

RDEPENDS:${PN} += "python3-core"

BBCLASSEXTEND = "native"
