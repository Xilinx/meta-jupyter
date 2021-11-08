SUMMARY = "Interactive plots and applications in the browser from Python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8ada4b0ebe4fbabce1547c58b10b7019"

inherit pypi setuptools3

SRC_URI[sha256sum] = "fcc0d0a3129ae457cdb0a4f503843a4d13d1f5d07af7748424ea8c7ddfc321f1"

RDEPENDS:${PN} += " \
	python3-pyyaml \
	python3-dateutil \
	python3-jinja2 \
	python3-numpy \
	python3-pillow \
	python3-packaging \
	python3-tornado \
	python3-typing-extensions \
"

BBCLASSEXTEND = "native"
