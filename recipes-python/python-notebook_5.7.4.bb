inherit pypi setuptools
require python-notebook.inc

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-ipaddress \
    ${PYTHON_PN}-futures \
"
