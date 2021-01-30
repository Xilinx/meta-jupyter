SUMMARY = "IPython: Productive Interactive Computing"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.rst;md5=93ef43efbd25773bbce636bbad9d247f"

PYPI_PACKAGE_EXT = "tar.gz"
RDEPENDS_${PN} += " \
	${PYTHON_PN}-debugger \
	${PYTHON_PN}-typing \
	${PYTHON_PN}-pexpect \
	${PYTHON_PN}-jedi (>= 0.10) \
	${PYTHON_PN}-decorator \
	${PYTHON_PN}-pickleshare \
	${PYTHON_PN}-traitlets (>= 4.2) \
	${PYTHON_PN}-pygments \
	${PYTHON_PN}-backcall \
	"

BBCLASSEXTEND = "native"
