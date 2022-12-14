SUMMARY = "Jupyter protocol implementation and client libraries"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=0d99f15eb14ae0f6bd895f65127d0fa8"

SRC_URI[sha256sum] = "05d4ff6a0ade25138c6bb0fbeac7ddc26b5fe835e7dd816b64b4a45b931bdc0b"
PYPI_PACKAGE = "jupyter_client"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-pyzmq \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-jupyter-core \
        ${PYTHON_PN}-tornado \
        ${PYTHON_PN}-dateutil \
        "

do_install:append () {
  if [ find ${D}/usr/bin -name "jupyter*" &> /dev/null ]; then
    for f in ${D}/usr/bin/jupyter*; do sed -i -e 's:env python$:env python3:' $f; done
  fi
}

BBCLASSEXTEND = "native"