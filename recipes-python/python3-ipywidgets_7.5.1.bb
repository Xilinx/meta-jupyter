inherit pypi setuptools3

SRC_URI[md5sum] = "090f5ad1294b084f075af8f684d8981f"
SRC_URI[sha256sum] = "e945f6e02854a74994c596d9db83444a1850c01648f1574adf144fbbabe05c97"

SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-ipython \
        ${PYTHON_PN}-ipykernel \
        ${PYTHON_PN}-widgetsnbextension \
        ${PYTHON_PN}-traitlets \
        "
