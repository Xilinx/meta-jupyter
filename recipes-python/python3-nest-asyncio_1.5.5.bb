SUMMARY = "This module patches asyncio to allow nested use of asyncio.run and loop.run_until_complete"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${WORKDIR}/nest_asyncio-1.5.5/LICENSE;md5=767eeb0122cccaf224035860df064532"

inherit pypi python_setuptools_build_meta

PYPI_SRC_URI = "https://files.pythonhosted.org/packages/7b/19/efddf713ba62f738d2bf410a6f5ead6e621f9354d5824091ce8b7a233e11/nest_asyncio-1.5.5.tar.gz"
SRC_URI[sha256sum] = "e442291cd942698be619823a17a86a5759eabe1f8613084790de189fe9e16d65"
S = "${WORKDIR}/nest_asyncio-1.5.5"

DEPENDS += " \
	${PYTHON_PN}-setuptools-scm-native \
	"