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

SRC_URI[md5sum] = "34cc7020d1ceeedd546c1a088f1cc805"
SRC_URI[sha256sum] = "f5cb275d30fc8085e2d1d18bc363e5ba0ce6e559bf37d7d6727b773134298754"
