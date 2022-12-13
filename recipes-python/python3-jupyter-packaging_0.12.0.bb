SUMMARY = "Tools for build and install Jupyter Python packages"
DESCRIPTION = "Tools to help build and install Jupyter Python packages that \
            require a pre-build step that may include JavaScript build steps."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3acab95fd69e0d08e339a87b8bc1081f"

SRC_URI[sha256sum] = "b27455d60adc93a7baa2e0b8f386be81b932bb4e3c0116046df9ed230cd3faac"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE="jupyter_packaging"

DEPENDS+="${PYTHON_PN}-packaging-native"

BBCLASSEXTEND = "native"