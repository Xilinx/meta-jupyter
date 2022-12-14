SUMMARY = "Pygments theme using JupyterLab CSS variables"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

SRC_URI[sha256sum] = "7405d7fde60819d905a9fa8ce89e4cd830e318cdad22a0030f7a901da705585d"
PYPI_PACKAGE = "jupyterlab_pygments"

inherit pypi setuptools3

DEPENDS += " \
    ${PYTHON_PN}-jupyter-packaging-native \
    "

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-pygments \
    "

FILES:${PN} += " \
    ${datadir}/jupyter/labextensions/jupyterlab_pygments/install.json \
    ${datadir}/jupyter/labextensions/jupyterlab_pygments/package.json \
    ${datadir}/jupyter/labextensions/jupyterlab_pygments/static/568.1e2faa2ba0bbe59c4780.js \
    ${datadir}/jupyter/labextensions/jupyterlab_pygments/static/747.8eb3ddccc7ec4987bff9.js \
    ${datadir}/jupyter/labextensions/jupyterlab_pygments/static/remoteEntry.aa1060b2d1221f8e5688.js \
    ${datadir}/jupyter/labextensions/jupyterlab_pygments/static/style.js \
    ${datadir}/jupyter/labextensions/jupyterlab_pygments/static/third-party-licenses.json \
    "
