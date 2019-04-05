inherit pypi setuptools
require python-jupyter-console.inc

RDEPENDS_${PN} += " \
	${PYTHON_PN}-prompt-toolkit (=1.0.15) \
	"

SRC_URI[md5sum] = "20eff10b4cd93f081207bfa0cc5a3b0e"
SRC_URI[sha256sum] = "d0b4ae4dfe070be1e9d5690fa819328acffb5f37a8ef3baa1c7e3b77b443cfd7"
