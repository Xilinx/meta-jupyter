inherit pypi setuptools3

SUMMARY = "The Jupyter Notebook format"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[sha256sum] = "54d4d6354835a936bad7e8182dcd003ca3dc0cedfee5a306090e04854343b340"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-jsonschema \
        ${PYTHON_PN}-ipython-genutils \
        ${PYTHON_PN}-jupyter-core \
        "
