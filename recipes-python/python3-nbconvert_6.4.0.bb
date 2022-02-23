inherit pypi setuptools3

SUMMARY = "Converting Jupyter Notebooks"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d235895c780fa844e875697e16e5787b"

# Requirements from PIP:
# jupyter-core(OK), bleach, nbformat(OK), mistune(OK), pygments(OK),
# pandocfilters(OK), jinja2(-), entrypoints(-), traitlets(decorator, six, ipython-genutils), testpath(-)
#

RDEPENDS:${PN} += " \
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

SRC_URI[sha256sum] = "5412ec774c6db4fccecb8c4ba07ec5d37d6dcf5762593cb3d6ecbbeb562ebbe5"
FILES:${PN} += "/usr/share/jupyter/"

BBCLASSEXTEND = "native"
