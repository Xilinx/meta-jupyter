SUMMARY = "Jupyter notebook"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

DEPENDS += " \
	${PYTHON_PN}-ipython-native \
	${PYTHON_PN}-traitlets-native \
	${PYTHON_PN}-six-native \
	${PYTHON_PN}-ipython-genutils-native \
	${PYTHON_PN}-decorator-native \
	${PYTHON_PN}-pygments-native \
	${PYTHON_PN}-pexpect-native \
	${PYTHON_PN}-ptyprocess-native \
	${PYTHON_PN}-pickleshare-native \
	${PYTHON_PN}-backcall-native \
	${PYTHON_PN}-wcwidth-native \
	${PYTHON_PN}-jupyter-client-native \
	${PYTHON_PN}-pyzmq-native \
	${PYTHON_PN}-jupyter-core-native \
	${PYTHON_PN}-simplegeneric-native \
	"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-ipython \
	${PYTHON_PN}-traitlets \
	${PYTHON_PN}-tornado \
	${PYTHON_PN}-jupyter-client \
	${PYTHON_PN}-simplegeneric \
	"

FILES_${PN} += "/usr/share/jupyter"
