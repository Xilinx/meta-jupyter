SUMMARY = "A shim layer for notebook traits and config"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f91a22ac359078bf4380ccbace244c41"

SRC_URI[sha256sum] = "b4b2cfa1b65d98307ca24361f5b30fe785b53c3fd07b7a47e89acb5e6ac638cb"

PYPI_PACKAGE = "notebook_shim"
inherit pypi python_hatchling

FILES:${PN} += "${prefix}"

RDEPENDS:${PN} = "python3-jupyter-server"

BBCLASSEXTEND = "native"
