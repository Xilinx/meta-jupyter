inherit pypi setuptools3
require python-jupyter-core.inc

do_install_append() {
	# this files will be installed by python-jupyter
	rm -f ${D}/usr/lib/python3.5/site-packages/jupyter.py
}

