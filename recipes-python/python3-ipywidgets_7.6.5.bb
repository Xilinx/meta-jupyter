inherit pypi setuptools3

SRC_URI[sha256sum] = "00974f7cb4d5f8d494c19810fedb9fa9b64bffd3cda7c2be23c133a1ad3c99c5"

SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-ipython \
        ${PYTHON_PN}-ipykernel \
        ${PYTHON_PN}-widgetsnbextension \
        ${PYTHON_PN}-traitlets \
        "
