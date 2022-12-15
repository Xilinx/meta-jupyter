SUMMARY = "Jupyter QtConsole"
DESCRIPTION = "A rich Qt-based console for working with Jupyter kernels, \
               supporting rich media output, session export, and more."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0b84758cc535b6c0e177dbda70ee3207"

SRC_URI[sha256sum] = "b73723fac43938b684dcb237a88510dc7721c43a726cea8ade179a2927c0a2f3"
inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-ipykernel \
        ${PYTHON_PN}-jupyter-core \
        ${PYTHON_PN}-jupyter-client \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-pygments \
        "