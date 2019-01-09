SUMMARY = "Jupyter Qt console"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0b84758cc535b6c0e177dbda70ee3207"

SRC_URI[sha256sum] = "bc1ba15f50c29ed50f1268ad823bb6543be263c18dd093b80495e9df63b003ac"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-ipykernel \
	${PYTHON_PN}-jupyter-core \
	${PYTHON_PN}-jupyter-client \
	${PYTHON_PN}-traitlets \
	${PYTHON_PN}-pygments \
	"
