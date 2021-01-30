SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-ipython \
	${PYTHON_PN}-ipykernel \
	${PYTHON_PN}-widgetsnbextension \
	${PYTHON_PN}-traitlets \
	"
