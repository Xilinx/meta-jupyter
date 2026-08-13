SUMMARY = "Jupyter Packaging Utilities."
HOMEPAGE = "http://jupyter.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3acab95fd69e0d08e339a87b8bc1081f"

SRC_URI[sha256sum] = "9d9b2b63b97ffd67a8bc5391c32a421bc415b264a32c99e4d8d8dd31daae9cf4"

PYPI_PACKAGE = "jupyter_packaging"
inherit pypi python_hatchling

RDEPENDS:${PN} = " \
	python3-packaging \
	python3-setuptools \
	python3-wheel \
	"

BBCLASSEXTEND = "native"
