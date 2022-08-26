inherit pypi python_setuptools_build_meta

DEPENDS += " \
	${PYTHON_PN}-prompt-toolkit-native \
	"

SUMMARY = "Jupyter notebook"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=9;endline=65;md5=6c019aca026ed989ebaefe22827424f8"

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
        ${PYTHON_PN}-stack-data-native \
        ${PYTHON_PN}-executing-native \
        ${PYTHON_PN}-asttokens-native \
        ${PYTHON_PN}-pure-eval-native \
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

SRC_URI += "file://0001-Modify-hatch_build-to-use-python3-as-default-interpr.patch"
SRC_URI[sha256sum] = "37acc3254caa8a0dafcddddc8dc863a60ad1b46487b68aee361d9a15bda98112"


