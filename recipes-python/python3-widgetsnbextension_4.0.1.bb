SUMMARY = "Jupyter Widgets for Jupyter Notebook"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

SRC_URI[sha256sum] = "bfa01945156f2bfd9a386bfc51b54ec5bfa26006d26bb75e5351e226f870fafb"
PYPI_PACKAGE = "widgetsnbextension"
inherit pypi setuptools3

DEPENDS += " \
    ${PYTHON_PN}-jupyter-packaging-native \
    "

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-notebook \
    "

FILES:${PN} += " \
    ${datadir}/jupyter/nbextensions/* \
    ${datadir}/etc/jupyter/* \
    ${prefix}/etc/jupyter/nbconfig/notebook.d/widgetsnbextension.json \
    "
