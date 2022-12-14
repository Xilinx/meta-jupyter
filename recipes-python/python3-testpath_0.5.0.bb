SUMMARY = "Test utilities for code working with files and commands"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa34f99e130d0bc2e278b523a99cac"

SRC_URI[sha256sum] = "1acf7a0bcd3004ae8357409fc33751e16d37ccc650921da1094a86581ad1e417"
SRC_URI:append = " \
	file://0001-pyproject.toml-Allow-flit-core-up-to-less-than-4.patch \
"
PYPI_PACKAGE = "testpath"

inherit pypi python_flit_core

BBCLASSEXTEND = "native"
