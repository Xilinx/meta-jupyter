SUMMARY = "Jupyter terminal console"
HOMEPAGE = "https://jupyter.org"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=083556a9912a35360dae8281fb57e886"

SRC_URI[sha256sum] = "566a4bf31c87adbfadf22cdf846e3069b59a71ed5da71d6ba4d8aaad14a53539"

PYPI_PACKAGE = "jupyter_console"
inherit pypi python_hatchling

RDEPENDS:${PN} = " \
	python3-ipykernel \
	python3-ipython \
	python3-jupyter-client \
	python3-jupyter-core \
	python3-prompt-toolkit \
	python3-pygments \
	python3-pyzmq \
	python3-traitlets \
"

BBCLASSEXTEND = "native"
