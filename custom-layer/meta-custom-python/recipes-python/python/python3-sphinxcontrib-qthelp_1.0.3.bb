
SUMMARY = "sphinxcontrib-qthelp is a sphinx extension which outputs QtHelp document."
HOMEPAGE = "http://sphinx-doc.org/"
AUTHOR = "Georg Brandl <georg@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f7a83b72ea86d04827575ec0b63430eb"

SRC_URI = "https://files.pythonhosted.org/packages/b1/8e/c4846e59f38a5f2b4a0e3b27af38f2fcf904d4bfd82095bf92de0b114ebd/sphinxcontrib-qthelp-1.0.3.tar.gz"
SRC_URI[md5sum] = "93216721f3e154cce12d1e9c3307b415"
SRC_URI[sha256sum] = "4c33767ee058b70dba89a6fc5c1892c0d57a54be67ddd3e7875a18d14cba5a72"

S = "${WORKDIR}/sphinxcontrib-qthelp-1.0.3"

RDEPENDS_${PN} = ""

inherit setuptools3
