
SUMMARY = "Docutils -- Python Documentation Utilities"
HOMEPAGE = "http://docutils.sourceforge.net/"
AUTHOR = "David Goodger <goodger@python.org>"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=836a1950177996968a49ff477a4a61c4"

SRC_URI = "https://files.pythonhosted.org/packages/4c/17/559b4d020f4b46e0287a2eddf2d8ebf76318fd3bd495f1625414b052fdc9/docutils-0.17.1.tar.gz"
SRC_URI[md5sum] = "ed810564c25063e9dac10dd0893ead47"
SRC_URI[sha256sum] = "686577d2e4c32380bb50cbb22f575ed742d58168cee37e99117a854bcd88f125"

S = "${WORKDIR}/docutils-0.17.1"

RDEPENDS_${PN} = ""

inherit setuptools3
