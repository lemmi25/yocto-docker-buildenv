
SUMMARY = "SiLA2 code generator for Python3"
HOMEPAGE = "https://gitlab.com/SiLA2/sila_python"
AUTHOR = "Timm Severin, Mark Dörr <mark.doerr@uni-greifswald.de>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=83833adef3a9be133fc3139495722bd0"

SRC_URI = "https://files.pythonhosted.org/packages/48/91/f058cfbfd810266999c91995699178490bbfb88e58e84f3d0a87257759cf/sila2codegenerator-0.2.0.tar.gz"
SRC_URI[md5sum] = "e79a96e6ed556f8e7fd68d98de6fba15"
SRC_URI[sha256sum] = "18f828c2e457d1adf5cb69b09f6673ae79f8d222195dfe6ce7efccd0ecfd8c7a"

S = "${WORKDIR}/sila2codegenerator-0.2.0"

RDEPENDS_${PN} = "python3-lxml python3-sila2lib"

inherit setuptools3
