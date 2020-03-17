inherit pypi setuptools3
require python-jupyterlab-server.inc

SRC_URI[md5sum] = "84215e737b8f8f92e0747890fb4ae385"
SRC_URI[sha256sum] = "d0977527bfce6f47c782cb6bf79d2c949ebe3f22ac695fa000b730c671445dad" 
RDEPENDS_${PN} += "${PYTHON_PN}-json5"
