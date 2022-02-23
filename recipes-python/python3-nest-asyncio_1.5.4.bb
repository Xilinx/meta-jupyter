inherit pypi setuptools3
SUMMARY = "This module patches asyncio to allow nested use of asyncio.run and loop.run_until_complete"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/nest_asyncio-1.5.4/LICENSE;md5=767eeb0122cccaf224035860df064532"

S = "${WORKDIR}/nest_asyncio-1.5.4"

PYPI_SRC_URI = "https://files.pythonhosted.org/packages/60/51/b74def9b027b864d1d9b22dfffec4ddd83f9c15f757a5a4a412566f27670/nest_asyncio-1.5.4.tar.gz"
SRC_URI[sha256sum] = "f969f6013a16fadb4adcf09d11a68a4f617c6049d7af7ac2c676110169a63abd"
