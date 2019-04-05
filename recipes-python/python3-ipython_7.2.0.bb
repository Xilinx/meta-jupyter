inherit pypi setuptools3
require python-ipython.inc
LIC_FILES_CHKSUM = "file://COPYING.rst;md5=59b20262b8663cdd094005bddf47af5f"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-asyncio \
        ${PYTHON_PN}-prompt-toolkit (>=2.0.0) \
	"
