SUMMARY = "Jupyter core package. A base package on which Jupyter projects rely."
HOMEPAGE = "https://jupyter.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5cc41e8bc83e8e689ce2c7bb0ceba14"

DEPENDS = "python3-hatchling-native"
SRC_URI[sha256sum] = "4d09aaff303b9566c3ce657f580bd089ff5c91f5f89cf7d8846c3cdf465b5508"

PYPI_PACKAGE = "jupyter_core"
inherit pypi python_hatchling

RDEPENDS:${PN} = " \
	python3-platformdirs \
	python3-traitlets \
	"

BBCLASSEXTEND = "native"
