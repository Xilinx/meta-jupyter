inherit pypi python_setuptools_build_meta

SUMMARY = "making Python packages with and without accompanying JavaScript packages"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3acab95fd69e0d08e339a87b8bc1081f"

PYPI_PACKAGE="jupyter_packaging"
PN="${PYTHON_PN}-jupyter-packaging"

DEPENDS+="${PYTHON_PN}-packaging-native"

BBCLASSEXTEND = "native"

SRC_URI[sha256sum] = "a8a2c90bf2e0cae83be63ccb0b7035032a1589f268cc08b1d479e37ce50fc940"
