SUMMARY = "Tiny 'shelve'-like database with concurrency support"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"

SRC_URI[md5sum] = "6a9e5dd8dfc023031f6b7b3f824cab12"
SRC_URI[sha256sum] = "84a9257227dfdd6fe1b4be1319096c20eb85ff1e82c7932f36efccfe1b09737b"
BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
	${PYTHON_PN}-pathlib2 \
	"
