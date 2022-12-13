SUMMARY = "Project provides a way for JupyterLab and other to switch to Jupyter Server"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f91a22ac359078bf4380ccbace244c41"

PYPI_PACKAGE = "notebook_shim"
PYPI_SRC_URI = "https://files.pythonhosted.org/packages/80/14/215050c5ee184bd60e7d1e9e7e68d09c4dcacb18d3fb49c1fff4e061b94f/notebook_shim-0.1.0.tar.gz"
SRC_URI[sha256sum] = "7897e47a36d92248925a2143e3596f19c60597708f7bef50d81fcd31d7263e85"

inherit pypi setuptools3 mime-xdg

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-jupyter-server \
    "

FILES:${PN} += " \
    ${prefix}/etc/jupyter/jupyter_server_config.d/notebook_shim.json \
    "