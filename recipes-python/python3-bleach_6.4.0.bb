SUMMARY = "An easy safelist-based HTML-sanitizing tool."
HOMEPAGE = "https://github.com/mozilla/bleach"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=adea50d072dac455e5a50a518e2d01aa \
                    file://bleach/_vendor/html5lib-1.1.dist-info/LICENSE;md5=1ba5ada9e6fead1fdc32f43c9f10ba7c"

SRC_URI[sha256sum] = "4202482733d85cedd04e59fcb2f89f4e4c7c385a78d3c3c23c30446843a37452"

inherit pypi setuptools3

PACKAGECONFIG ?= "css"
PACKAGECONFIG[css] = ",,,python3-tinycss2"

RDEPENDS:${PN} += " \
	bash \
	python3-core \
	python3-six \
	python3-stringold \
	python3-webencodings \
	python3-xml \
	"

RRECOMMENDS:${PN} += "python3-chardet"

BBCLASSEXTEND = "native"
