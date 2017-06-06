SUMMARY = "Jupyter notebook"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "3f9074031258de895f12102379394dcd"
SRC_URI[sha256sum] = "dfadef2babd7c04c6c257df7d07d7ba587e503dbb4e4c95305f9a95b8d3a9765"

RDEPENDS_${PN} += " \
	python-ipykernel \
	python-jupyter-core \
	python-traitlets \
	python-tornado \
	python-ipython-genutils \
	python-jupyter-client \
	python-nbformat \
	python-nbconvert \
	python-jinja2 \
	python-terminado \
	python-unixadmin \
	"


inherit pypi setuptools
