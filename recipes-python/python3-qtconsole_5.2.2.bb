inherit pypi setuptools3

SUMMARY = "Jupyter Qt console"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0b84758cc535b6c0e177dbda70ee3207"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-ipykernel \
        ${PYTHON_PN}-jupyter-core \
        ${PYTHON_PN}-jupyter-client \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-pygments \
        "

SRC_URI[sha256sum] = "8f9db97b27782184efd0a0f2d57ea3bd852d053747a2e442a9011329c082976d"
