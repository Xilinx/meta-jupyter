inherit pypi setuptools3

SUMMARY = "The JupyterLab notebook server extension"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f15a0f6069821527d1d4552e17acdf1"

DEPENDS+= " \
	${PYTHON_PN}-jupyter_packaging-native \
	"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-notebook \
        ${PYTHON_PN}-babel \
        ${PYTHON_PN}-jupyterlab_server \
        ${PYTHON_PN}-anyio \
        ${PYTHON_PN}-sniffio \
        ${PYTHON_PN}-nbclassic \
        "

do_install_append(){

	install -d ${D}/usr/share/jupyter/lab
	cp -r ${S}/jupyterlab/schemas ${D}/usr/share/jupyter/lab/
	cp -r ${S}/jupyterlab/themes ${D}/usr/share/jupyter/lab/
	cp -r ${B}/lib/jupyterlab/static ${D}/usr/share/jupyter/lab/
}

FILES_${PN}_append = " /usr/share/etc/jupyter/jupyter_notebook_config.d/jupyterlab.json /usr/share/jupyter/lab "

BBCLASSEXTEND = "native"
SRC_URI[md5sum] = "dc92f26fc4a81bd384206f00d2a93965"
SRC_URI[sha256sum] = "72759e43d6063d4b3bf5bc4fa5ef72dd970bc43bdcb82d87affee73bbdb5be34"
