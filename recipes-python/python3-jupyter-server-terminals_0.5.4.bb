SUMMARY = "A Jupyter Server Extension Providing Terminals."
HOMEPAGE = "https://jupyter.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ee82bc15ab23966cc24cc4e361736bda"

DEPENDS = "python3-hatchling-native"
SRC_URI[sha256sum] = "bbda128ed41d0be9020349f9f1f2a4ab9952a73ed5f5ac9f1419794761fb87f5"

PYPI_PACKAGE = "jupyter_server_terminals"
inherit pypi python_hatchling

FILES:${PN} += "${prefix}"

RDEPENDS:${PN} = "python3-terminado"

BBCLASSEXTEND = "native"
