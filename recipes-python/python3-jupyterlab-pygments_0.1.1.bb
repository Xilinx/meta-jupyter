SUMMARY = "Pygments theme using JupyterLab CSS variables"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f15a0f6069821527d1d4552e17acdf1"

PYPI_PACKAGE = "jupyterlab_pygments"

inherit pypi setuptools3

SRC_URI[sha256sum] = "19a0ccde7daddec638363cd3d60b63a4f6544c9181d65253317b2fb492a797b9"

RDEPENDS_${PN} += "python3-pygments"
