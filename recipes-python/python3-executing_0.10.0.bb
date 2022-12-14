SUMMARY = "Get the currently executing AST node of a frame, and other information"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a3d6c15f7859ae235a78f2758e5a48cf"

SRC_URI[sha256sum] = "d1cd87c2e371e9966261410c5b3769d6df2f9e4a79a83eebd2662dd3388f9833"
PYPI_PACKAGE = "executing"

inherit pypi python_setuptools_build_meta

DEPENDS += " \
	${PYTHON_PN}-setuptools-scm-native \
	"

BBCLASSEXTEND = "native"