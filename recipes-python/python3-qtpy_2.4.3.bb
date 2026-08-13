SUMMARY = "QtPy is a small abstraction layer that lets you write applications using a single API call to either PyQt or PySide."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b2830f54500be1314b9ec6096989f983"

SRC_URI[sha256sum] = "db744f7832e6d3da90568ba6ccbca3ee2b3b4a890c3d6fbbc63142f6e4cdf5bb"

PYPI_PACKAGE = "qtpy"
inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "python3-packaging"
# the binding lives in meta-qt6, which this layer does not depend on
RRECOMMENDS:${PN} = "python3-pyqt6"

BBCLASSEXTEND = "native"
