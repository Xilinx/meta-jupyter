SUMMARY = "Interactive plots and applications in the browser from Python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8ada4b0ebe4fbabce1547c58b10b7019"

SRC_URI[sha256sum] = "f0a4b53364ed3b7eb936c5cb1a4f4132369e394c7ae0a8ef420459410958033d"

inherit pypi setuptools3

RDEPENDS:${PN} += " \
	${PYTHON_PN}-pyyaml \
	${PYTHON_PN}-dateutil \
	${PYTHON_PN}-jinja2 \
	${PYTHON_PN}-numpy \
	${PYTHON_PN}-pillow \
	${PYTHON_PN}-packaging \
	${PYTHON_PN}-tornado \
	${PYTHON_PN}-typing-extensions \
"

BBCLASSEXTEND = "native"