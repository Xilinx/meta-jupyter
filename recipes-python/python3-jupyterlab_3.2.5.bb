inherit pypi setuptools3

SUMMARY = "The JupyterLab notebook server extension"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8bcc6c9ef50f2097920808c2bc5bffd2"

DEPENDS+= " \
	${PYTHON_PN}-jupyter_packaging-native \
	"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-notebook \
        ${PYTHON_PN}-babel \
        ${PYTHON_PN}-jupyterlab_server \
        ${PYTHON_PN}-anyio \
        ${PYTHON_PN}-sniffio \
        ${PYTHON_PN}-nbclassic \
        "

do_install:append(){

	install -d ${D}/usr/share/jupyter/lab
	cp -r ${S}/jupyterlab/schemas ${D}/usr/share/jupyter/lab/
	cp -r ${S}/jupyterlab/themes ${D}/usr/share/jupyter/lab/
	cp -r ${B}/lib/jupyterlab/static ${D}/usr/share/jupyter/lab/
}

FILES:${PN}:append = " /usr/share/etc/jupyter/jupyter_notebook_config.d/jupyterlab.json /usr/share/jupyter/lab "

BBCLASSEXTEND = "native"
SRC_URI[sha256sum] = "31b28f473b0f5826d2020583973c385526f0559b5b26efac6b8035ac1562874a"
