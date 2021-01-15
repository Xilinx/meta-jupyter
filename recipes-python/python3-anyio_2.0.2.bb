SUMMARY=" AnyIO is a asynchronous compatibility API that allows applications and libraries written against it to run unmodified on asyncio, curio and trio."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f0e423eea5c91e7aa21bdb70184b3e53"

inherit pypi setuptools3

SRC_URI[sha256sum] = "35075abd32cf20fd7e0be2fee3614e80b92d5392eba257c8d2f33de3df7ca237"
SRC_URI_append = " \
	file://0001-setup.cfg-Create-a-patch-to-set-the-pkg-version-corr.patch \
"
