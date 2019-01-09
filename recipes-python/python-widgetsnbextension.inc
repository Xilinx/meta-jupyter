SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[md5sum] = "0aa4e152c9ba2d704389dc2453f448c7"
SRC_URI[sha256sum] = "c618cfb32978c9517caf0b4ef3aec312f8dd138577745e7b0d4abfcc7315ce51"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-notebook \
	"

FILES_${PN} += " /usr/share/jupyter/nbextensions/*"
