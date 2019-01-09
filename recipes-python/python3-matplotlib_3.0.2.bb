inherit pypi setuptools3
require python-matplotlib.inc

SRC_URI += " \
 file://fix-setupext.patch \
"
