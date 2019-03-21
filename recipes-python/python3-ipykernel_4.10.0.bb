inherit pypi setuptools3

DEPENDS += " \
	${PYTHON_PN}-prompt-toolkit2-native \
	"

require python-ipykernel.inc
