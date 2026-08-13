SUMMARY = "A python library adding a json log formatter"
HOMEPAGE = "http://github.com/madzak/python-json-logger"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44a18ebf6d8412ddd5d29217ff70e291"

SRC_URI[sha256sum] = "b396b9e3ed782b09ff9d6e4f1683d46c83ad0d35d2e407c09a9ebbf038f88195"

PYPI_PACKAGE = "python_json_logger"
inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
	python3-core \
	python3-datetime \
	python3-json \
	python3-logging \
	python3-math \
	python3-unittest \
	"

BBCLASSEXTEND = "native"
