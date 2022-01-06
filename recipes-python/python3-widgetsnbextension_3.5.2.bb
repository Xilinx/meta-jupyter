inherit pypi setuptools3

SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[sha256sum] = "e0731a60ba540cd19bbbefe771a9076dcd2dde90713a8f87f27f53f2d1db7727"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-notebook \
        "

FILES:${PN} += " /usr/share/jupyter/nbextensions/* \
    /usr/share/etc/jupyter/* \ "

