inherit pypi setuptools3
require python-jupyter-core.inc

SRC_URI[md5sum] = "8456f961604616c242d6c5817b38508d"
SRC_URI[sha256sum] = "a183e0ec2e8f6adddf62b0a3fc6a2237e3e0056d381e536d3e7c7ecc3067e244"

do_install_append() {
	# this files will be installed by python-jupyter
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/jupyter.py
	rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/__pycache__/jupyter.cpython-37.pyc
}


