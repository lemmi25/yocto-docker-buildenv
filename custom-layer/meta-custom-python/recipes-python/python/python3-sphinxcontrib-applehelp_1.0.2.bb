
SUMMARY = "sphinxcontrib-applehelp is a sphinx extension which outputs Apple help books"
HOMEPAGE = "http://sphinx-doc.org/"
AUTHOR = "Georg Brandl <georg@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c7715857042d4c8c0105999ca0c072c5"

SRC_URI = "https://files.pythonhosted.org/packages/9f/01/ad9d4ebbceddbed9979ab4a89ddb78c9760e74e6757b1880f1b2760e8295/sphinxcontrib-applehelp-1.0.2.tar.gz"
SRC_URI[md5sum] = "3f2de7681e12dde031acee0497c3cc2b"
SRC_URI[sha256sum] = "a072735ec80e7675e3f432fcae8610ecf509c5f1869d17e2eecff44389cdbc58"

S = "${WORKDIR}/sphinxcontrib-applehelp-1.0.2"

RDEPENDS_${PN} = ""

inherit setuptools3
