SUMMARY = "A sane and fast Markdown parser with useful plugins and renderers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7662a489238001edfceff24a3ce11cbd"

SRC_URI[sha256sum] = "58b5c96d6fcb61190dfe5fae498d2b2065f99cf61e9649418fd54cf1ada86dfe"

inherit pypi python_setuptools_build_meta

BBCLASSEXTEND = "native"
