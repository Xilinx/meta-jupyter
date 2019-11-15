SUMMARY = "Python library that provides an easy interface to read and write a wide range of image data, including animated images, video, volumetric data, and scientific formats."
SECTION = "devel/python"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=55c0f320370091249c1755c0d2b48e89"

inherit pkgconfig distutils3

SRC_URI = " \
    https://github.com/python-pillow/Pillow/archive/${PV}.tar.gz \
    file://0001-build-always-disable-platform-guessing.patch \
"

SRC_URI[md5sum] = "dfaa11389b8c165c99bf86c4d87ba56e"
SRC_URI[sha256sum] = "5d8c0d6fc1e4b662f0e7c40ed83e06367a90e8b11b227d5141b51badae56248e"

S = "${WORKDIR}/Pillow-${PV}"

DEPENDS += "python3 libjpeg-turbo zlib tiff freetype libpng jpeg"

CFLAGS_append = " -I${STAGING_INCDIR}"
LDFLAGS_append = " -L${STAGING_LIBDIR}"

do_compile_prepend() {
    export LDFLAGS="$LDFLAGS -L${STAGING_LIBDIR}"
    export CFLAGS="$CFLAGS -I${STAGING_INCDIR}"
}
