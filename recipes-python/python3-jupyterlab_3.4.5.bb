inherit pypi python_setuptools_build_meta

SUMMARY = "The JupyterLab notebook server extension"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8bcc6c9ef50f2097920808c2bc5bffd2"

DEPENDS+= " \
	${PYTHON_PN}-jupyter-packaging-native \
	"

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

FILES:${PN}:append = " \
                /usr/share/etc/jupyter/jupyter_notebook_config.d/jupyterlab.json \
                /usr/share/jupyter/lab \
                /usr/etc/jupyter/jupyter_notebook_config.d \
                /usr/etc/jupyter/jupyter_server_config.d \ 
                /usr/etc/jupyter/jupyter_notebook_config.d/jupyterlab.json \ 
                /usr/etc/jupyter/jupyter_server_config.d/jupyterlab.json \
                "

BBCLASSEXTEND = "native"
SRC_URI[sha256sum] = "472f6b7996c75f6991592483c26d9fe205a59a71ccbce15842400155dc64f59b"
