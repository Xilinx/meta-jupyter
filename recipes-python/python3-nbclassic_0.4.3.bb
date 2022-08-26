SUMMARY="NBClassic runs the Jupyter Notebook frontend on the Jupyter Server backend."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=499d1d2265d9af5274240ff36cdb500a"

inherit pypi python_setuptools_build_meta mime-xdg

SRC_URI[sha256sum] = "f03111b2cebaa69b88370a7b23b19b2b37c9bb71767f1828cdfd7a047eae8edd"
FILES:${PN} += " \
        /usr/share/etc/jupyter/jupyter_server_config.d/nbclassic.json \
        /usr/etc/jupyter/jupyter_server_config.d/nbclassic.json \
        /usr/share/icons/hicolor/scalable/apps/nbclassic.svg \
       "
