inherit pypi setuptools3

SUMMARY = "The JupyterLab notebook server extension"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f15a0f6069821527d1d4552e17acdf1"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-notebook \
        ${PYTHON_PN}-jupyterlab-server \
        "

FILES_${PN}_append = " /usr/share/etc/jupyter/jupyter_notebook_config.d/jupyterlab.json /usr/share/jupyter/lab "

SRC_URI[md5sum] = "3cd2e427fd0dfaa859851b33c2c99075"
SRC_URI[sha256sum] = "8aa9bc4b5020e7b9ec6e006d516d48bddf7d2528680af65840464ee722d59db3"
