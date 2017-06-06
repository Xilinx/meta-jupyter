SUMMARY = "The fastest markdown parser in pure Python"
LICENSE = "BSD"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a6126a07066cdda07c9c4acfa8ceccd2"

SRC_URI = "git://github.com/lepture/mistune;branch=master"
SRCREV = "1a50827a8de4849aeb865934d1f73b8fb5b2252d"

PV = "gitr${SRCPV}"
S = "${WORKDIR}/git"

inherit setuptools
