inherit pypi setuptools3
require python-jupyter-console.inc

RDEPENDS_${PN} += " \
	${PYTHON_PN}-prompt-toolkit \
	"

