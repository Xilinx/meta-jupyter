SUMMARY = "A Python implementation of the JSON5 data format."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=18413e679155848797966e3c2319a9ea"

SRC_URI[sha256sum] = "7424d1f1eb1d56da6e3d70643f53619862b4ce81440bdb8ecfd6f875e5ba4a71"

inherit pypi python_setuptools_build_meta

BBCLASSEXTEND = "native"
