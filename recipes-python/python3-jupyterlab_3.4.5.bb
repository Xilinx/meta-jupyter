SUMMARY = "JupyterLab is the next-generation web-based user interface for Project Jupyter"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8bcc6c9ef50f2097920808c2bc5bffd2"

SRC_URI[sha256sum] = "472f6b7996c75f6991592483c26d9fe205a59a71ccbce15842400155dc64f59b"

inherit pypi setuptools3

PYPI_PACKAGE = "jupyterlab"

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-notebook \
    ${PYTHON_PN}-babel \
    ${PYTHON_PN}-jupyterlab-server \
    ${PYTHON_PN}-anyio \
    ${PYTHON_PN}-sniffio \
    ${PYTHON_PN}-nbclassic \
    "

do_install:append(){
	install -d ${D}/usr/share/jupyter/lab
	cp -r ${S}/jupyterlab/schemas ${D}/usr/share/jupyter/lab/
	cp -r ${S}/jupyterlab/themes ${D}/usr/share/jupyter/lab/
	cp -r ${B}/jupyterlab/static ${D}/usr/share/jupyter/lab/
}

FILES:${PN} += " \
    ${datadir}/etc/jupyter/jupyter_notebook_config.d/jupyterlab.json \
    ${datadir}/jupyter/lab \
    ${prefix}/etc/jupyter/jupyter_notebook_config.d \
    ${prefix}/etc/jupyter/jupyter_server_config.d \
    ${prefix}/etc/jupyter/jupyter_notebook_config.d/jupyterlab.json \
    ${prefix}/etc/jupyter/jupyter_server_config.d/jupyterlab.json \
    "

BBCLASSEXTEND = "native"