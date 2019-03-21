SUMMARY = "Jupyter notebook"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=d235895c780fa844e875697e16e5787b"

SRC_URI[sha256sum] = "308ce876354924fb6c540b41d5d6d08acfc946984bf0c97777c1ddcb42e0b2f5"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-ipykernel \
	${PYTHON_PN}-ipython \
	${PYTHON_PN}-jupyter-client \
	${PYTHON_PN}-pygments \
	"

PYPI_PACKAGE = "jupyter_console"

do_install_append() {
	# Make sure we use /usr/bin/env python
	for PYTHSCRIPT in `grep -rIl '^#!.*python' ${D}`; do
		sed -i -e '1s|^#!.*|#!/usr/bin/env ${PYTHON_PN}|' $PYTHSCRIPT
	done
}
