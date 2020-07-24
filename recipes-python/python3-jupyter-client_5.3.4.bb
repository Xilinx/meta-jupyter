inherit pypi setuptools3

SRC_URI[md5sum] = "7eed8b4259b4daeea4504a98a4799621"
SRC_URI[sha256sum] = "60e6faec1031d63df57f1cc671ed673dced0ed420f4377ea33db37b1c188b910"

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
