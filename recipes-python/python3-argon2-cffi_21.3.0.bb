SUMMARY = "Secure ARgon2 password hashing algorithm"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file:///${S}/argon2_cffi-21.3.0.dist-info/LICENSE;md5=d4ab25949a73fe7d4fdee93bcbdbf8ff"

SRC_URI = "https://files.pythonhosted.org/packages/a8/07/946d5a9431bae05a776a59746ec385fbb79b526738d25e4202d3e0bbf7f4/argon2_cffi-21.3.0-py3-none-any.whl;downloadfilename=argon2_cffi-21.3.0-py3-none-any.zip;subdir=${BP}"

SRC_URI[md5sum] = "23666b79fb18c22056efc8e34a08ade4"
SRC_URI[sha256sum] = "8c976986f2c5c0e5000919e6de187906cfd81fb1c72bf9d88c01177e77da7f80"

inherit python3-dir

PV = "21.3.0"
PN = "python3-argon2-cffi"

DEPENDS += " \
	python3-wheel-native \
	python3-pip-native \
"

FILES:${PN} += "\
    ${libdir}/${PYTHON_DIR}/site-packages/* \
"

do_install() {
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages/argon2_cffi-21.3.0.dist-info
    install -d ${D}${libdir}/${PYTHON_DIR}/site-packages/argon2

    install -m 644 ${S}/argon2/* ${D}${libdir}/${PYTHON_DIR}/site-packages/argon2/
    install -m 644 ${S}/argon2_cffi-21.3.0.dist-info/* ${D}${libdir}/${PYTHON_DIR}/site-packages/argon2_cffi-21.3.0.dist-info/
}
