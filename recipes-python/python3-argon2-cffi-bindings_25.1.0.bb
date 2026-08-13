SUMMARY = "argon2-cffi-bindings provides low-level CFFI bindings to the Argon2 password hashing algorithm including a vendored version of them."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4642dfcbd13c1cc49e9f99df9de51ba1"

DEPENDS = " \
	python3-cffi-native \
	python3-setuptools-scm-native \
	"

SRC_URI[sha256sum] = "b957f3e6ea4d55d820e40ff76f450952807013d361a65d7f28acc0acbf29229d"

export ARGON2_CFFI_USE_SSE2 = "0"

PYPI_PACKAGE = "argon2_cffi_bindings"
inherit pypi python_setuptools_build_meta

# not visible to the ELF dependency scanner
RDEPENDS:${PN} = "python3-cffi"

BBCLASSEXTEND = "native"
