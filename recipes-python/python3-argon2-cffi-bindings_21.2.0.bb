SUMMARY = "Low-level Python CFFI Bindings for Argon2"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file:///${S}/argon2_cffi_bindings-21.2.0.dist-info/LICENSE;md5=4642dfcbd13c1cc49e9f99df9de51ba1"

SRC_URI:x86_64 = "https://files.pythonhosted.org/packages/2e/f1/48888db30b6a4a0c78ab7bc7444058a1135b223b6a2a5f2ac7d6780e7443/argon2_cffi_bindings-21.2.0-pp38-pypy38_pp73-manylinux_2_17_x86_64.manylinux2014_x86_64.whl;downloadfilename=argon2_cffi_bindings-21.2.0-pp38-pypy38_pp73-manylinux_2_17_x86_64.manylinux2014_x86_64.zip;subdir=${BP};name=argon2_cffi_bindings_x86"

SRC_URI:aarch64 = "https://files.pythonhosted.org/packages/43/f3/20bc53a6e50471dfea16a63dc9b69d2a9ec78fd2b9532cc25f8317e121d9/argon2_cffi_bindings-21.2.0-pp38-pypy38_pp73-manylinux_2_17_aarch64.manylinux2014_aarch64.whl;downloadfilename=argon2_cffi_bindings-21.2.0-pp38-pypy38_pp73-manylinux_2_17_aarch64.manylinux2014_aarch64.zip;subdir=${BP};name=argon2_cffi_bindings_aarch64"

SRC_URI[argon2_cffi_bindings_x86.md5sum] = "e79ecae27c6ef91f8a79373ea0bee2cf"
SRC_URI[argon2_cffi_bindings_x86.sha256sum] = "20ef543a89dee4db46a1a6e206cd015360e5a75822f76df533845c3cbaf72670"

SRC_URI[argon2_cffi_bindings_aarch64.sha256sum] = "d4966ef5848d820776f5f562a7d45fdd70c2f330c961d0d745b784034bd9f48d"


inherit python3-dir

PV = "21.2.0"
PN = "python3-argon2-cffi-bindings"

DEPENDS += " \
	python3-wheel-native \
	python3-pip-native \
"

FILES:${PN} += "\
    ${libdir}/${PYTHON_DIR}/site-packages/* \
"

do_install() {
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages/argon2_cffi_bindings-21.2.0.dist-info
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages/_argon2_cffi_bindings

    install -m 644 ${S}/_argon2_cffi_bindings/* ${D}${libdir}/${PYTHON_DIR}/site-packages/_argon2_cffi_bindings/
    install -m 644 ${S}/argon2_cffi_bindings-21.2.0.dist-info/* ${D}${libdir}/${PYTHON_DIR}/site-packages/argon2_cffi_bindings-21.2.0.dist-info/
}
