SUMMARY = "The Jupyter Notebook format"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[sha256sum] = "f7494ef0df60766b7cabe0a3651556345a963b74dbc16bc7c18479041170d402"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-traitlets \
	${PYTHON_PN}-jsonschema \
	${PYTHON_PN}-ipython-genutils \
	${PYTHON_PN}-jupyter-core \
	"
