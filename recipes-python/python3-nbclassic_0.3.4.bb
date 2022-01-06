SUMMARY="NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=499d1d2265d9af5274240ff36cdb500a"

inherit pypi setuptools3

SRC_URI[sha256sum] = "f00b07ef4908fc38fd332d2676ccd3ceea5076528feaf21bd27e809ef20f5578"
FILES:${PN} += "/usr/share/etc/jupyter/jupyter_server_config.d/nbclassic.json"
