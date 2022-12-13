SUMMARY = "IPython Kernel for Jupyter"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING.md;beginline=1;endline=34;md5=f0a133522b9d35a1ecee12860db8e986"

SRC_URI[sha256sum] = "0e28273e290858393e86e152b104e5506a79c13d25b951ac6eca220051b4be60"
SRC_URI += "\
    file://0001-setup.py-Use-python3-executable-as-default-interpret.patch \
    "

inherit pypi setuptools3

PYPI_PACKAGE = "ipykernel"

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
        ${PYTHON_PN}-entrypoints-native \
        ${PYTHON_PN}-prompt-toolkit-native \
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

FILES:${PN} += "${datadir}/jupyter"

BBCLASSEXTEND = "native"