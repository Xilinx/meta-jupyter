SUMMARY="NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=499d1d2265d9af5274240ff36cdb500a"

SRC_URI[sha256sum] = "f03111b2cebaa69b88370a7b23b19b2b37c9bb71767f1828cdfd7a047eae8edd"
PYPI_PACKAGE = "nbclassic"

inherit pypi setuptools3 mime-xdg

do_install:append() {
    # These files will conflict with ${PYTHON_PN}-notebook
    mv ${D}${bindir}/jupyter-bundlerextension ${D}${bindir}/jupyter-nbclassic-bundlerextension
    mv ${D}${bindir}/jupyter-nbextension ${D}${bindir}/jupyter-nbclassic-nbextension
    mv ${D}${bindir}/jupyter-serverextension ${D}${bindir}/jupyter-nbclassic-serverextension
}

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-jupyter-packaging \
    ${PYTHON_PN}-babel \
    "

FILES:${PN} += " \
    ${datadir}/etc/jupyter/jupyter_server_config.d/nbclassic.json \
    ${prefix}/etc/jupyter/jupyter_server_config.d/nbclassic.json \
    ${datadir}/icons/hicolor/scalable/apps/nbclassic.svg \
    "

BBCLASSEXTEND = "native nativesdk"