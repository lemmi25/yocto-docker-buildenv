
SUMMARY = "A sphinx extension which renders display math in HTML via JavaScript"
HOMEPAGE = "http://sphinx-doc.org/"
AUTHOR = "Georg Brandl <georg@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f0064c10bd544bcffccbc67a41c108d3"

SRC_URI = "https://files.pythonhosted.org/packages/b2/e8/9ed3830aeed71f17c026a07a5097edcf44b692850ef215b161b8ad875729/sphinxcontrib-jsmath-1.0.1.tar.gz"
SRC_URI[md5sum] = "e45179f0a3608b6766862e0f34c23b62"
SRC_URI[sha256sum] = "a9925e4a4587247ed2191a22df5f6970656cb8ca2bd6284309578f2153e0c4b8"

S = "${WORKDIR}/sphinxcontrib-jsmath-1.0.1"

RDEPENDS_${PN} = ""

inherit setuptools3
