SUMMARY = "Pygments theme using JupyterLab CSS variables"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f15a0f6069821527d1d4552e17acdf1"

PYPI_PACKAGE = "jupyterlab_pygments"

inherit pypi setuptools3

SRC_URI[sha256sum] = "cfcda0873626150932f438eccf0f8bf22bfa92345b814890ab360d666b254146"

RDEPENDS:${PN} += "python3-pygments"
