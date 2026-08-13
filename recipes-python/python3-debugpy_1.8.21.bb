SUMMARY = "debugpy is an implementation of the Debug Adapter Protocol for Python."
HOMEPAGE = "https://pypi.org/project/debugpy/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7b6b095fe2a2e2b66cb08d295b605789"

SRC_URI[sha256sum] = "a3c53278e84c94e11bd87c53970ec391d1a67396c8b22609fcac576520e611a6"

inherit pypi python_setuptools_build_meta

BBCLASSEXTEND = "native"
