SUMMARY = "A hatch plugin to help build Jupyter packages"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3a55a0c831659a5e5451fd45de9d4342"

SRC_URI[sha256sum] = "79278198d124c646b799c5e8dca8504aed9dcaaa88d071a09eb0b5c2009a58ad"

PYPI_PACKAGE = "hatch_jupyter_builder"
inherit pypi python_hatchling

RDEPENDS:${PN} = "python3-hatchling"

BBCLASSEXTEND = "native"
