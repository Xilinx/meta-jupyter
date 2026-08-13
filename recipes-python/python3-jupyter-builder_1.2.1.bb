SUMMARY = "JupyterLab build tools"
HOMEPAGE = "https://github.com/jupyterlab/jupyter-builder"
LICENSE = "BSD-3-Clause & MIT & ISC"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=7de9d42ddd419e9e255c47f6859596c1 \
	file://THIRD_PARTY_LICENSES/semver.LICENSE.txt;md5=6292483c4a4f0297efed02d5637ee1de \
	file://THIRD_PARTY_LICENSES/yarn.js.LICENSE.txt;md5=f4e4a624cc21683a92191e35778ed40c \
	"

DEPENDS += " \
	python3-hatch-nodejs-version-native \
	"

SRC_URI[sha256sum] = "05772287000a550b6e363812a6f5a197865e758d61833464225e9cfaf5966b56"

PYPI_PACKAGE = "jupyter_builder"
inherit pypi python_hatchling

RDEPENDS:${PN} = " \
	python3-core \
	python3-jupyter-core \
	python3-traitlets \
	"

BBCLASSEXTEND = "native"
