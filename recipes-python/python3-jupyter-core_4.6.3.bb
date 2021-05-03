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

SRC_URI[md5sum] = "aaed36bf01888c9e810462e6226db70a"
SRC_URI[sha256sum] = "394fd5dd787e7c8861741880bdf8a00ce39f95de5d18e579c74b882522219e7e"

do_install_append() {
	# this files will be installed by python-jupyter
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/jupyter.py
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/__pycache__/jupyter.cpython-37.pyc
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/__pycache__/jupyter.cpython-38.pyc
}


