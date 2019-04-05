inherit pypi setuptools3

DEPENDS += " \
	${PYTHON_PN}-prompt-toolkit-native \
	"

require python-ipykernel.inc
