SUMMARY = "Jupyter core package"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=3956703c5c1fefa0fc1876fc9b4c7499"

SRC_URI[md5sum] = "7829fc07884ed98459e170f217e2a5ba"
SRC_URI[sha256sum] = "ba70754aa680300306c699790128f6fbd8c306ee5927976cbe48adacf240c0b7"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-traitlets \
	"

PYPI_PACKAGE = "jupyter_core"

do_install_append() {
	# Make sure we use /usr/bin/env python
	for PYTHSCRIPT in `grep -rIl '^#!.*python' ${D}`; do
		sed -i -e '1s|^#!.*|#!/usr/bin/env ${PYTHON_PN}|' $PYTHSCRIPT
	done
}

BBCLASSEXTEND = "native"
