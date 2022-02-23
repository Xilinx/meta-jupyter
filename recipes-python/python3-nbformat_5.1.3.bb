inherit pypi setuptools3

SUMMARY = "The Jupyter Notebook format"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[sha256sum] = "b516788ad70771c6250977c1374fcca6edebe6126fd2adb5a69aa5c2356fd1c8"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-jsonschema \
        ${PYTHON_PN}-ipython-genutils \
        ${PYTHON_PN}-jupyter-core \
        "
BBCLASSEXTEND = "native"
