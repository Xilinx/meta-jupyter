SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "245c978e0ca64b9e686b716c71efb675"
SRC_URI[sha256sum] = "afa6248850cff14ef86117db87aeab0b12237e4eaf740e73716460ed593a43a7"

RDEPENDS_${PN} += " \
	python-ipython \
	python-ipykernel \
	python-widgetsnbextension \
	python-traitlets \
	"


inherit pypi setuptools
