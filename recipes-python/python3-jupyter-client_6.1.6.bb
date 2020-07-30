inherit pypi setuptools3

SRC_URI[md5sum] = "ca545481d8a875b5eb66ff48625395ef"
SRC_URI[sha256sum] = "b360f8d4638bc577a4656e93f86298db755f915098dc763f6fc05da0c5d7a595"

SUMMARY = "Jupyter protocol implementation and client libraries"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=d235895c780fa844e875697e16e5787b"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-pyzmq \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-jupyter-core \
        ${PYTHON_PN}-tornado \
        ${PYTHON_PN}-dateutil \
        "

PYPI_PACKAGE = "jupyter_client"

BBCLASSEXTEND = "native"

do_install_append () {
  if [ find ${D}/usr/bin -name "jupyter*" &> /dev/null ]; then
    for f in ${D}/usr/bin/jupyter*; do sed -i -e 's:env python$:env python3:' $f; done
  fi
}
