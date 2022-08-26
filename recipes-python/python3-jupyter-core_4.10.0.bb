inherit pypi python_setuptools_build_meta

SUMMARY = "Jupyter core package"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=277a3014c124832f733b12621c348d31"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-setuptools \
        "

PYPI_PACKAGE = "jupyter_core"

do_install:append() {
        # Make sure we use /usr/bin/env python
        for PYTHSCRIPT in `grep -rIl '^#!.*python' ${D}`; do
                sed -i -e '1s|^#!.*|#!/usr/bin/env ${PYTHON_PN}|' $PYTHSCRIPT
        done
}

BBCLASSEXTEND = "native"

SRC_URI[sha256sum] = "a6de44b16b7b31d7271130c71a6792c4040f077011961138afed5e5e73181aec"

do_install:append() {
	# these files will be installed by python-jupyter
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/jupyter.py
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/__pycache__/jupyter.cpython-*.pyc
}


