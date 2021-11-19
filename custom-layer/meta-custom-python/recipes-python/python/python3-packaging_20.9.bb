
SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"
AUTHOR = "Donald Stufft and individual contributors <donald@stufft.io>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.APACHE;md5=2ee41112a44fe7014dce33e26468ba93"

SRC_URI = "https://files.pythonhosted.org/packages/86/3c/bcd09ec5df7123abcf695009221a52f90438d877a2f1499453c6938f5728/packaging-20.9.tar.gz"
SRC_URI[md5sum] = "5377308b3ba89f2d78c05e7f485be65d"
SRC_URI[sha256sum] = "5b327ac1320dc863dca72f4514ecc086f31186744b84a230374cc1fd776feae5"

S = "${WORKDIR}/packaging-20.9"

RDEPENDS_${PN} = "python3-pyparsing"

inherit setuptools3
