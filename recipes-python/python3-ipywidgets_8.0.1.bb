inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "1a296094203309e834f2781a275214d255ac5d266bbfa602f9f6915e1806614c"

SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-ipython \
        ${PYTHON_PN}-ipykernel \
        ${PYTHON_PN}-widgetsnbextension \
        ${PYTHON_PN}-traitlets \
        "
