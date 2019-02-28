DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication quality figures in a variety of hardcopy formats "
SECTION = "devel/python"
LICENSE = "PSF"
LIC_FILES_CHKSUM = "file://LICENSE/LICENSE;md5=afec61498aa5f0c45936687da9a53d74"

DEPENDS += " \
	${PYTHON_PN}-numpy-native \
	freetype \
	libpng \
	${PYTHON_PN}-dateutil \
	${PYTHON_PN}-pytz \
	${PYTHON_PN}-kiwisolver \
	"

RDEPENDS_${PN} = " \
	${PYTHON_PN}-core \
	${PYTHON_PN}-distutils \
	${PYTHON_PN}-numpy \
	freetype \
	libpng \
	${PYTHON_PN}-dateutil \
	${PYTHON_PN}-pytz \
	${PYTHON_PN}-cycler \
	${PYTHON_PN}-kiwisolver \
	"

SRC_URI[md5sum] = "d6af3dfae557ea4046fef96cf617fa24"
SRC_URI[sha256sum] = "c94b792af431f6adb6859eb218137acd9a35f4f7442cea57e4a59c54751c36af"

PYPI_PACKAGE = "matplotlib"

