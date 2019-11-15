SUMMARY = "The JupyterLab notebook server extension"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f15a0f6069821527d1d4552e17acdf1"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-notebook \
	${PYTHON_PN}-jupyterlab-server \
	"

FILES_${PN}_append = " /usr/share/etc/jupyter/jupyter_notebook_config.d/jupyterlab.json /usr/share/jupyter/lab "
