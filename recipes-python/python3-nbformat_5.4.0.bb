inherit pypi python_setuptools_build_meta

SUMMARY = "The Jupyter Notebook format"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[sha256sum] = "44ba5ca6acb80c5d5a500f1e5b83ede8cbe364d5a495c4c8cf60aaf1ba656501"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-fastjsonschema \
        ${PYTHON_PN}-ipython-genutils \
        ${PYTHON_PN}-jupyter-core \
        "
BBCLASSEXTEND = "native"
