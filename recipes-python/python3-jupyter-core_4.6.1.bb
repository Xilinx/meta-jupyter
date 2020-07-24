inherit pypi setuptools3

SUMMARY = "Jupyter core package"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=3956703c5c1fefa0fc1876fc9b4c7499"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-setuptools \
        "

PYPI_PACKAGE = "jupyter_core"

do_install_append() {
        # Make sure we use /usr/bin/env python
        for PYTHSCRIPT in `grep -rIl '^#!.*python' ${D}`; do
                sed -i -e '1s|^#!.*|#!/usr/bin/env ${PYTHON_PN}|' $PYTHSCRIPT
        done
}

BBCLASSEXTEND = "native"

SRC_URI[md5sum] = "8456f961604616c242d6c5817b38508d"
SRC_URI[sha256sum] = "a183e0ec2e8f6adddf62b0a3fc6a2237e3e0056d381e536d3e7c7ecc3067e244"

do_install_append() {
	# this files will be installed by python-jupyter
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/jupyter.py
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/__pycache__/jupyter.cpython-37.pyc
}


