SUMMARY = "Pygments theme using JupyterLab CSS variables"
HOMEPAGE = "https://github.com/jupyterlab/jupyterlab_pygments"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

DEPENDS += " \
	python3-hatch-nodejs-version-native \
	python3-hatch-jupyter-builder-native \
	"

SRC_URI[sha256sum] = "721aca4d9029252b11cfa9d185e5b5af4d54772bb8072f9b7036f4170054d35d"

PYPI_PACKAGE = "jupyterlab_pygments"
inherit pypi python_hatchling

# the sdist ships the prebuilt labextension
export SKIP_JUPYTER_BUILDER = "1"

JUPYTER_ENSURED_TARGETS = " \
	jupyterlab_pygments/labextension/static/style.js \
	jupyterlab_pygments/labextension/package.json \
"

do_configure:prepend() {
    # jupyterlab may be listed inline or on its own line
    sed -i -e 's/, *"jupyterlab[^"]*"//' \
           -e '/^[[:space:]]*"jupyterlab[<>=~ ]/d' ${S}/pyproject.toml
}

do_configure:append() {
    for target in ${JUPYTER_ENSURED_TARGETS}; do
        if [ ! -f ${S}/$target ]; then
            bbfatal "$target is missing from the sdist, so the JavaScript" \
                    "assets would have to be built here"
        fi
    done
}

RDEPENDS:${PN} += "python3-core python3-pygments"

FILES:${PN} += "${prefix}"

BBCLASSEXTEND = "native"
