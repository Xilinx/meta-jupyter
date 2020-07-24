inherit pypi setuptools3

SUMMARY = "The JupyterLab notebook server extension"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f15a0f6069821527d1d4552e17acdf1"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-notebook \
        ${PYTHON_PN}-jupyterlab-server \
        "

FILES_${PN}_append = " /usr/share/etc/jupyter/jupyter_notebook_config.d/jupyterlab.json /usr/share/jupyter/lab "

SRC_URI[md5sum] = "b41310612c2808f48aca58f6c00fb46d"
SRC_URI[sha256sum] = "2188a9bcaaf0b6a68ff9098a481f37ece8231634b862fd3c9adedc466aac79f2"
