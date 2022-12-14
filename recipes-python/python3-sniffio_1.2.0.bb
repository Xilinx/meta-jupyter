SUMMARY="sniffio: Sniff out which async library your code is running under"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa7b86389e58dd4087a8d2b833e5fe96"

inherit pypi setuptools3

SRC_URI[sha256sum] = "c4666eecec1d3f50960c6bdf61ab7bc350648da6c126e3cf6898d8cd4ddcd3de"
BBCLASSEXTEND = "native"
