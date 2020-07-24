inherit pypi setuptools3

SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "3dc5f96919c032a885950e3819bdee7b"
SRC_URI[sha256sum] = "079f87d87270bce047512400efd70238820751a11d2d8cb137a5a5bdbaf255c7"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-notebook \
        "

FILES_${PN} += " /usr/share/jupyter/nbextensions/* \
    /usr/share/etc/jupyter/* \ "

