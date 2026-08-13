SUMMARY = "Pygments lexers for highlighting IPython code"
HOMEPAGE = "https://github.com/ipython/ipython-pygments-lexers"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=59028f809aa24c7b88bff27927343d58"

SRC_URI[sha256sum] = "09c0138009e56b6854f9535736f4171d855c8c08a563a0dcd8022f78355c7e81"

PYPI_PACKAGE = "ipython_pygments_lexers"
inherit pypi python_flit_core

RDEPENDS:${PN} = " \
	python3-core \
	python3-pygments \
	"

BBCLASSEXTEND = "native"
