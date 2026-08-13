SUMMARY = "Jupyter interactive widgets for Jupyter Notebook"
HOMEPAGE = "https://github.com/jupyter-widgets/ipywidgets"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

DEPENDS += "python3-jupyter-packaging-native"

SRC_URI[sha256sum] = "de8610639996f1567952d763a5a41af8af37f2575a41f9852a38f947eb82a3b9"

inherit pypi setuptools3

FILES:${PN} += "${prefix}"

RDEPENDS:${PN} = "python3-core"

BBCLASSEXTEND = "native"
