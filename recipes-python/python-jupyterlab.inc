SUMMARY = "The JupyterLab notebook server extension"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f15a0f6069821527d1d4552e17acdf1"

SRC_URI[sha256sum] = "deba0b2803640fcad72c61366bff11d5945173015961586d5e3b2f629ffeb455"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-notebook \
	${PYTHON_PN}-jupyterlab-server \
	"

FILES_${PN}_append = " /usr/share/etc/jupyter/jupyter_notebook_config.d/jupyterlab.json /usr/share/jupyter/lab "
