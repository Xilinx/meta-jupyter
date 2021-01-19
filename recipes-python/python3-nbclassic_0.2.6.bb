SUMMARY="NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=499d1d2265d9af5274240ff36cdb500a"

inherit pypi setuptools3

SRC_URI[sha256sum] = "b649436ff85dc731ba8115deef089e5abbe827d7a6dccbad42c15b8d427104e8"
FILES_${PN} += "/usr/share/etc/jupyter/jupyter_server_config.d/nbclassic.json"
