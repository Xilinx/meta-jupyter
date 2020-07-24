inherit pypi setuptools3

SUMMARY = "Converting Jupyter Notebooks"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d235895c780fa844e875697e16e5787b"

# Requirements from PIP:
# jupyter-core(OK), bleach, nbformat(OK), mistune(OK), pygments(OK),
# pandocfilters(OK), jinja2(-), entrypoints(-), traitlets(decorator, six, ipython-genutils), testpath(-)
#

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-jupyter-core \
        ${PYTHON_PN}-pygments \
        ${PYTHON_PN}-mistune \
        ${PYTHON_PN}-nbformat \
        ${PYTHON_PN}-jinja2 \
        ${PYTHON_PN}-entrypoints \
        ${PYTHON_PN}-configparser \
        ${PYTHON_PN}-pandocfilters \
        ${PYTHON_PN}-bleach \
        ${PYTHON_PN}-testpath \
        ${PYTHON_PN}-nbformat \
        ${PYTHON_PN}-defusedxml \
        "

SRC_URI[md5sum] = "cc766e4f109f97651c005e7fee524c98"
SRC_URI[sha256sum] = "21fb48e700b43e82ba0e3142421a659d7739b65568cc832a13976a77be16b523"
