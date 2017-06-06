SUMMARY = "Jupyter notebook"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

SRC_URI[md5sum] = "af2fc6a3d6cc5a02d0bf54d909785fcb"
SRC_URI[sha256sum] = "5b06af87df13818d14f08a028e42f566640aef80805c3b50c5056b086e3c2b9c"

RDEPENDS_${PN} += " \
	python-six \
	"


inherit pypi setuptools
