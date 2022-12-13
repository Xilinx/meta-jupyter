SUMMARY = "Python Pre-Commit package"
DECRIPTION = "Python framework for managing and maintaining multi-language \
           pre-commit hooks You specify a list of hooks you want and pre-commit \
           manages the installation and execution of any hook written in any \
           language before every commit. pre-commit is specifically designed to \
           not require root access. If one of your developers doesn’t have node \
           installed but modifies a JavaScript file, pre-commit automatically \
           handles downloading and building node to run eslint without root."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b53a93744e3ff841e5fc9a934da8e1c8"

SRC_URI[sha256sum] = "5d445ee1fa8738d506881c5d84f83c62bb5be6b2838e32207433647e8e5ebe10"

PYPI_PACKAGE = "pre_commit"

inherit pypi python_setuptools_build_meta

BBCLASSEXTEND = "native"