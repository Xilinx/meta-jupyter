SUMMARY = "Jupyter Qt console"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0b84758cc535b6c0e177dbda70ee3207"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-ipykernel \
	${PYTHON_PN}-jupyter-core \
	${PYTHON_PN}-jupyter-client \
	${PYTHON_PN}-traitlets \
	${PYTHON_PN}-pygments \
	"
