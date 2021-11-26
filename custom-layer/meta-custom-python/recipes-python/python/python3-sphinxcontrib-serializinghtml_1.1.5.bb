
SUMMARY = "sphinxcontrib-serializinghtml is a sphinx extension which outputs "serialized" HTML files (json and pickle)."
HOMEPAGE = "http://sphinx-doc.org/"
AUTHOR = "Georg Brandl <georg@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=32a84ac5cd3bbd10c4d479233ad588b6"

SRC_URI = "https://files.pythonhosted.org/packages/b5/72/835d6fadb9e5d02304cf39b18f93d227cd93abd3c41ebf58e6853eeb1455/sphinxcontrib-serializinghtml-1.1.5.tar.gz"
SRC_URI[md5sum] = "d99d2edc7b26988dc5fa92163857bfbf"
SRC_URI[sha256sum] = "aa5f6de5dfdf809ef505c4895e51ef5c9eac17d0f287933eb49ec495280b6952"

S = "${WORKDIR}/sphinxcontrib-serializinghtml-1.1.5"

RDEPENDS_${PN} = ""

inherit setuptools3
