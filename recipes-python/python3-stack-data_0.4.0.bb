inherit pypi python_setuptools_build_meta

SUMMARY = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a3d6c15f7859ae235a78f2758e5a48cf"

PYPI_PACKAGE = "stack_data"

RDEPENDS:${PN} += " ${PYTHON_PN}-executing \
                    ${PYTHON_PN}-asttokens \
                    ${PYTHON_PN}-pure-eval \
                  "

SRC_URI[sha256sum] = "a90ae7e260f7d15aefeceb46f0a028d4ccb9eb8856475c53e341945342d41ea7"

DEPENDS += " \
	${PYTHON_PN}-setuptools-scm-native \
"

BBCLASSEXTEND = "native"
