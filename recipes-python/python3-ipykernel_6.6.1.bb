inherit pypi setuptools3

DEPENDS += " \
	${PYTHON_PN}-prompt-toolkit-native \
	"

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

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-ipython \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-tornado \
        ${PYTHON_PN}-debugpy \
        ${PYTHON_PN}-jupyter-client \
        ${PYTHON_PN}-simplegeneric \
        ${PYTHON_PN}-matplotlib-inline \
        "

FILES:${PN} += "/usr/share/jupyter"

SRC_URI[sha256sum] = "91ff0058b45660aad4a68088041059c0d378cd53fc8aff60e5abc91bcc049353"

SRC_URI:append = " \
	file://0001-Modify-setup.py-to-set-exectuable-python3-when-build.patch \
"

