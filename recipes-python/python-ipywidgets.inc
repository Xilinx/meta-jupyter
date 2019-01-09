SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

SRC_URI[sha256sum] = "a3e224f430163f767047ab9a042fc55adbcab0c24bbe6cf9f306c4f89fdf0ba3"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-ipython \
	${PYTHON_PN}-ipykernel \
	${PYTHON_PN}-widgetsnbextension \
	${PYTHON_PN}-traitlets \
	"
