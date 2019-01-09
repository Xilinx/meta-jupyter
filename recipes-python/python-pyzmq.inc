SUMMARY = "Pyzmq provides Zero message queue access for the Python language"
HOMEPAGE = "http://zeromq.org/bindings:python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.BSD;md5=11c65680f637c3df7f58bbc8d133e96e"

DEPENDS = "zeromq"

SRC_URI[sha256sum] = "a72b82ac1910f2cf61a49139f4974f994984475f771b0faa730839607eeedddf"

RDEPENDS_${PN} += "${PYTHON_PN}-multiprocessing"

FILES_${PN}-dbg =+ "${PYTHON_SITEPACKAGES_DIR}/zmq/backend/cython/.debug"

PYPI_PACKAGE = "pyzmq"

do_compile_prepend() {
    echo [global] > ${S}/setup.cfg
    echo zmq_prefix = ${STAGING_DIR_HOST} >> ${S}/setup.cfg
    echo have_sys_un_h = True >> ${S}/setup.cfg
    echo skip_check_zmq = True >> ${S}/setup.cfg
    echo libzmq_extension = False >> ${S}/setup.cfg
    echo no_libzmq_extension = True >> ${S}/setup.cfg
}

BBCLASSEXTEND = "native"
