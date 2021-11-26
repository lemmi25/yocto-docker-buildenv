
SUMMARY = "sphinxcontrib-htmlhelp is a sphinx extension which renders HTML help files"
HOMEPAGE = "http://sphinx-doc.org/"
AUTHOR = "Georg Brandl <georg@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=24dce5ef6a13563241c24bc366f48886"

SRC_URI = "https://files.pythonhosted.org/packages/eb/85/93464ac9bd43d248e7c74573d58a791d48c475230bcf000df2b2700b9027/sphinxcontrib-htmlhelp-2.0.0.tar.gz"
SRC_URI[md5sum] = "70765b55395a3c20233631802902c840"
SRC_URI[sha256sum] = "f5f8bb2d0d629f398bf47d0d69c07bc13b65f75a81ad9e2f71a63d4b7a2f6db2"

S = "${WORKDIR}/sphinxcontrib-htmlhelp-2.0.0"

RDEPENDS_${PN} = ""

inherit setuptools3
