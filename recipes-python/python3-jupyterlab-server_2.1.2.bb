SUMMARY = "JupyterLab Server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

PYPI_PACKAGE = "jupyterlab_server"
PN="python3-jupyterlab_server"

inherit pypi setuptools3

RDEPENDS_${PN} += " \
        ${PYTHON_PN}-notebook \
        ${PYTHON_PN}-jsonschema \
        "

SRC_URI[md5sum] = "0e244382fc2a5dec49e64d008c8d355f"
SRC_URI[sha256sum] = "a71ebeb89eb2ab49eca41768f9840bb6896c264203ea755990313d4dfa610a74"

RDEPENDS_${PN} += "${PYTHON_PN}-json5"
