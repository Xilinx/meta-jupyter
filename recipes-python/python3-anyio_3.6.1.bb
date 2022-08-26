SUMMARY=" AnyIO is a asynchronous compatibility API that allows applications and libraries written against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0a769411d2af7894099e8ff75058c9f"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "413adf95f93886e442aea925f3ee43baa5a765a64a0f52c6081894f9992fdd0b"
SRC_URI:append = " \
	file://0001-setup.cfg-Create-a-patch-to-set-the-pkg-version-corr.patch \
"

BBCLASSEXTEND = "native"
