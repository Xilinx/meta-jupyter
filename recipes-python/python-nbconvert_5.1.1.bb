SUMMARY = "Converting Jupyter Notebooks"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "d0263fb03a44db2f94eea09a608ed813"
SRC_URI[sha256sum] = "847731bc39829d0eb1e15a450ac98c71730e3598e53683d4d76a3f3b3fc5017d"

#python-entrypoints

RDEPENDS_${PN} += " \
	python-traitlets \
	python-jupyter-core \
	python-pygments \
	python-mistune \
	python-nbformat \
	python-jinja2 \
	"

inherit pypi setuptools
