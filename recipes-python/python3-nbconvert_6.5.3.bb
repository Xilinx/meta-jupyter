inherit pypi python_setuptools_build_meta

SUMMARY = "Converting Jupyter Notebooks"
LICENSE = "BSD-3-Clause"
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
        ${PYTHON_PN}-pandocfilters \
        ${PYTHON_PN}-bleach \
        ${PYTHON_PN}-testpath \
        ${PYTHON_PN}-nbformat \
        ${PYTHON_PN}-defusedxml \
	${PYTHON_PN}-lxml \
	${PYTHON_PN}-beautifulsoup4 \
	${PYTHON_PN}-soupsieve \
        "

SRC_URI[sha256sum] = "10ed693c4cfd3c63583c87ca5c3a2f6ed874145103595f3824efcc8dfcb7522c"
FILES:${PN} += "/usr/share/jupyter/"

BBCLASSEXTEND = "native"
