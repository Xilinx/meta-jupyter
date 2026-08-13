SUMMARY = "Argon2 won the Password Hashing Competition and argon2-cffi is the simplest way to use it in Python."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e91e96ef55f45fe9caf7fc3e73672c4b"

DEPENDS += " \
	python3-hatch-vcs-native \
	python3-hatch-fancy-pypi-readme-native \
	"

SRC_URI[sha256sum] = "694ae5cc8a42f4c4e2bf2ca0e64e51e23a040c6a517a85074683d3959e1346c1"

PYPI_PACKAGE = "argon2_cffi"
inherit pypi python_hatchling

RDEPENDS:${PN} = "python3-argon2-cffi-bindings"

BBCLASSEXTEND = "native"
