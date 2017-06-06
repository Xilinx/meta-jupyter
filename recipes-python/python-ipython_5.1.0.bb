SUMMARY = "IPython: Productive Interactive Computing"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "9d6a0bd4d4c18a4dc88d2f69dfefdea7"
SRC_URI[sha256sum] = "2db893efa27c237f314a4f28294279f5dabafff1d0a7bbb45f95e44edb17810c"

PYPI_PACKAGE_EXT = "zip"
#backports.shutil-get-terminal-size
RDEPENDS_${PN} += " \
	python-backports-shutil-get-terminal-size \
	python-pickleshare \
	python-prompt-toolkit \
	python-traitlets \
	python-decorator \
	python-pygments \
	python-simplegeneric \
	python-pexpect \
	python-pathlib2 \
	"


inherit pypi setuptools
