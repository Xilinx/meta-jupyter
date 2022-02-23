inherit pypi setuptools3 mime-xdg

SUMMARY = "Jupyter notebook"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-ipykernel \
        ${PYTHON_PN}-jupyter-core \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-tornado \
        ${PYTHON_PN}-ipython-genutils \
        ${PYTHON_PN}-jupyter-client \
        ${PYTHON_PN}-nbformat \
        ${PYTHON_PN}-nbconvert \
        ${PYTHON_PN}-jinja2 \
        ${PYTHON_PN}-terminado \
        ${PYTHON_PN}-unixadmin \
        ${PYTHON_PN}-prometheus-client \
        ${PYTHON_PN}-send2trash \
        ${PYTHON_PN}-pyzmq \
        ${PYTHON_PN}-sqlite3 \
        ${PYTHON_PN}-argon2-cffi \
        "

do_install:append() {
        # Make sure we use /usr/bin/env python
        for PYTHSCRIPT in `grep -rIl '^#!.*python' ${D}`; do
                sed -i -e '1s|^#!.*|#!/usr/bin/env ${PYTHON_PN}|' $PYTHSCRIPT
        done
}

SRC_URI[sha256sum] = "7bcdf79bd1cda534735bd9830d2cbedab4ee34d8fe1df6e7b946b3aab0902ba3"
FILES:${PN}+= "/usr/share/icons"
