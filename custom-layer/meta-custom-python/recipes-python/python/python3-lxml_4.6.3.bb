
SUMMARY = "Powerful and Pythonic XML processing library combining libxml2/libxslt with the ElementTree API."
HOMEPAGE = "https://lxml.de/"
AUTHOR = "lxml dev team <lxml-dev@lxml.de>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSES.txt;md5=e4c045ebad958ead4b48008f70838403"

SRC_URI = "https://files.pythonhosted.org/packages/e5/21/a2e4517e3d216f0051687eea3d3317557bde68736f038a3b105ac3809247/lxml-4.6.3.tar.gz"
SRC_URI[md5sum] = "017f94473dcec0f9b2e9b03524398fa5"
SRC_URI[sha256sum] = "39b78571b3b30645ac77b95f7c69d1bffc4cf8c3b157c435a34da72e78c82468"

S = "${WORKDIR}/lxml-4.6.3"

RDEPENDS_${PN} = ""

inherit setuptools3
