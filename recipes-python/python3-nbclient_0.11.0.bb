SUMMARY = "A client library for executing notebooks. Formerly nbconvert's ExecutePreprocessor."
HOMEPAGE = "https://jupyter.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f188c37957b44d9adbe64cb1932895"

DEPENDS = "python3-hatchling-native"
SRC_URI[sha256sum] = "04a134a5b087f2c5887f228aca155db50169b8cd9334dee6942c8e927e56081a"

inherit pypi python_hatchling

RDEPENDS:${PN} = " \
	python3-jupyter-client \
	python3-jupyter-core \
	python3-nbformat \
	python3-traitlets \
	"

BBCLASSEXTEND = "native"
