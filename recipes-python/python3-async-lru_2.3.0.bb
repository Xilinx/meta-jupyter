SUMMARY = "Simple LRU cache for asyncio"
HOMEPAGE = "https://github.com/aio-libs/async-lru"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=637551ffe345b083f0847cebe17a634d"

SRC_URI[sha256sum] = "89bdb258a0140d7313cf8f4031d816a042202faa61d0ab310a0a538baa1c24b6"

PYPI_PACKAGE = "async_lru"
inherit pypi setuptools3

RDEPENDS:${PN} += " \
	python3-asyncio \
	python3-core \
	"

BBCLASSEXTEND = "native"
