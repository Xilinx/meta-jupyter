SUMMARY = "scandir, a better directory iterator and faster os.walk()"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=5d382df20ca1800201fcfb3692337ae2"

SRC_URI[md5sum] = "a2713043de681bba6b084be42e7a8a44"
SRC_URI[sha256sum] = "c2612d1a487d80fb4701b4a91ca1b8f8a695b1ae820570815e85e8c8b23f1283"

#RDEPENDS_${PN} += " \
#	python-six \
#	python-scanlib \
#"

inherit pypi setuptools
