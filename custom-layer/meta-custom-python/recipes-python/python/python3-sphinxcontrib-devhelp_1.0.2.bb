
SUMMARY = "sphinxcontrib-devhelp is a sphinx extension which outputs Devhelp document."
HOMEPAGE = "http://sphinx-doc.org/"
AUTHOR = "Georg Brandl <georg@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd30d9972a142c857a80c9f312e92b93"

SRC_URI = "https://files.pythonhosted.org/packages/98/33/dc28393f16385f722c893cb55539c641c9aaec8d1bc1c15b69ce0ac2dbb3/sphinxcontrib-devhelp-1.0.2.tar.gz"
SRC_URI[md5sum] = "94069c5cdb5079c445f5477fa6107016"
SRC_URI[sha256sum] = "ff7f1afa7b9642e7060379360a67e9c41e8f3121f2ce9164266f61b9f4b338e4"

S = "${WORKDIR}/sphinxcontrib-devhelp-1.0.2"

RDEPENDS_${PN} = ""

inherit setuptools3
