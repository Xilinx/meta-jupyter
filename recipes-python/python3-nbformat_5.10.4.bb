SUMMARY = "The Jupyter Notebook format"
HOMEPAGE = "https://jupyter.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=083556a9912a35360dae8281fb57e886"

DEPENDS = " \
	python3-hatch-nodejs-version-native \
	"

SRC_URI[sha256sum] = "322168b14f937a5d11362988ecac2a4952d3d8e3a2cbeb2319584631226d5b3a"

inherit pypi python_hatchling

RDEPENDS:${PN} = " \
	python3-fastjsonschema \
	python3-jsonschema \
	python3-jupyter-core \
	python3-traitlets \
	"

BBCLASSEXTEND = "native"
