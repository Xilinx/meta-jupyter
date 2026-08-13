SUMMARY = "Hatch plugin for versioning from a package.json file"
HOMEPAGE = "https://github.com/agoose77/hatch-nodejs-version"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f35b870d1270c398ee82da12ae79578a"

SRC_URI[sha256sum] = "2428ea398dd053f019d2b7ac949dd6b690ca8e826b6d433ad13c5b6c475ae91b"

PYPI_PACKAGE = "hatch_nodejs_version"
inherit pypi python_hatchling

RDEPENDS:${PN} = "python3-hatchling"

BBCLASSEXTEND = "native"
