SUMMARY = "Jupyter notebook"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "e4ee1bf2d025a6016fdf03a8f748aa01"
SRC_URI[sha256sum] = "699103c8e64886e3ec7053f2a6aa83bb90426063526f63a818732ff385202bad"

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
