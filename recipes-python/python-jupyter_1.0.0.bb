SUMMARY = "Jupyter notebook"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "25142b08e2ad7142b6f920bc8cc8dfeb"
SRC_URI[sha256sum] = "3e1f86076bbb7c8c207829390305a2b1fe836d471ed54be66a3b8c41e7f46cc7"

PYPI_PACKAGE_EXT = "zip"

DEPENDS += " \
	python-ipykernel \
	python-jupyter-console \
	python-qtconsole \
	python-notebook \
	python-ipywidgets \
	python-nbconvert \
	"
	
RDEPENDS_${PN} += " \
	python-ipykernel \
	python-jupyter-console \
	python-qtconsole \
	python-notebook \
	python-ipywidgets \
	python-nbconvert \
	"


inherit pypi setuptools
