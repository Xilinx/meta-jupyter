SUMMARY = "Jupyter notebook"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[sha256sum] = "6268c9ec9048cff7a45405c990c29ac9ca40b0bc3ec29263d218c5e01f2b4e86"
SRC_URI:append = " \
	file://0001-pyproject.toml-Allow-jupyter-packaging-to-be-greater.patch \
"

inherit pypi setuptools3 mime-xdg

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
    ${PYTHON_PN}-jupyter-packaging \
    "

do_install:append() {
        # Make sure we use /usr/bin/env python
        for PYTHSCRIPT in `grep -rIl '^#!.*python' ${D}`; do
                sed -i -e '1s|^#!.*|#!/usr/bin/env ${PYTHON_PN}|' $PYTHSCRIPT
        done
}

FILES:${PN}+= " \
    ${datadir}/icons \
    "
