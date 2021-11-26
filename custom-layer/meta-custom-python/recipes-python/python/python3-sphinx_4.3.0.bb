
SUMMARY = "Python documentation generator"
HOMEPAGE = "https://www.sphinx-doc.org/"
AUTHOR = "Georg Brandl <georg@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82cc7d23060a75a07b820eaaf75abecf"

SRC_URI = "https://files.pythonhosted.org/packages/45/14/8a3bf633c8141bd58e027f36fc5e775da308c635437eb45f13d1633915ea/Sphinx-4.3.0.tar.gz"
SRC_URI[md5sum] = "bf115873619a996897415c3b499787db"
SRC_URI[sha256sum] = "6d051ab6e0d06cba786c4656b0fe67ba259fe058410f49e95bee6e49c4052cbf"

S = "${WORKDIR}/Sphinx-4.3.0"

RDEPENDS_${PN} = "python3-sphinxcontrib-applehelp python3-sphinxcontrib-devhelp python3-sphinxcontrib-jsmath python3-sphinxcontrib-htmlhelp python3-sphinxcontrib-serializinghtml python3-sphinxcontrib-qthelp python3-jinja2 python3-pygments python3-docutils python3-snowballstemmer python3-babel python3-alabaster python3-imagesize python3-requests python3-setuptools python3-packaging"

inherit setuptools3
