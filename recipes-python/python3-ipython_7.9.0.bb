inherit pypi setuptools3

LIC_FILES_CHKSUM = "file://COPYING.rst;md5=59b20262b8663cdd094005bddf47af5f"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-asyncio \
        ${PYTHON_PN}-prompt-toolkit (>=2.0.0) \
	"

SRC_URI[md5sum] = "68542bca2ebf39af7d9d0557e7fb5708"
SRC_URI[sha256sum] = "dfd303b270b7b5232b3d08bd30ec6fd685d8a58cabd54055e3d69d8f029f7280"

SUMMARY = "IPython: Productive Interactive Computing"
LICENSE = "BSD"

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
        ${PYTHON_PN}-modules \
        "

BBCLASSEXTEND = "native"

