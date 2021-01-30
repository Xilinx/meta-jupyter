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
