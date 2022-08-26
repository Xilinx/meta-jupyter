inherit pypi python_setuptools_build_meta

SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

SRC_URI[sha256sum] = "bfa01945156f2bfd9a386bfc51b54ec5bfa26006d26bb75e5351e226f870fafb"

DEPENDS += "python3-jupyter-packaging-native"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-notebook \
        "

FILES:${PN} += " /usr/share/jupyter/nbextensions/* \
    /usr/share/etc/jupyter/* \ 
   /usr/etc/jupyter/nbconfig/notebook.d/widgetsnbextension.json \
    "

