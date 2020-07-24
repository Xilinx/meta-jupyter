inherit pypi setuptools3

SUMMARY = "Jupyter Qt console"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0b84758cc535b6c0e177dbda70ee3207"

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-ipykernel \
        ${PYTHON_PN}-jupyter-core \
        ${PYTHON_PN}-jupyter-client \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-pygments \
        "

SRC_URI[md5sum] = "146d40e4ab1ae737754afa306cf14d0c"
SRC_URI[sha256sum] = "654f423662e7dfe6a9b26fac8ec76aedcf742c339909ac49f1f0c1a1b744bcd1"
