SUMMARY = "Jupyter Event System library"
HOMEPAGE = "http://jupyter.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=469c300e985ff0b264c3ba21b4fae725"

DEPENDS = "python3-hatchling-native"
SRC_URI[sha256sum] = "faff25f77218335752f35f23c5fe6e4a392a7bd99a5939ccb9b8fbf594636cf3"

PYPI_PACKAGE = "jupyter_events"
inherit pypi python_hatchling

RDEPENDS:${PN} = " \
	python3-json-logger \
	python3-jsonschema \
	python3-packaging \
	python3-pyyaml \
	python3-referencing \
	python3-rfc3339-validator \
	python3-rfc3986-validator \
	python3-traitlets \
"

BBCLASSEXTEND = "native"
