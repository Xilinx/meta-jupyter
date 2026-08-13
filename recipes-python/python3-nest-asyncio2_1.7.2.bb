SUMMARY = "Patch asyncio to allow nested event loops"
HOMEPAGE = "https://github.com/Chaoses-Ib/nest-asyncio2"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=188d865c71965e8e9cd8cb21c1fa5b66"

DEPENDS += "python3-setuptools-scm-native"

SRC_URI[sha256sum] = "1921d70b92cc4612c374928d081552efb59b83d91b2b789d935c665fa01729a8"

PYPI_PACKAGE = "nest_asyncio2"
inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = " \
	python3-asyncio \
	python3-core \
	"

BBCLASSEXTEND = "native"
