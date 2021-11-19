
SUMMARY = "Python HTTP for Humans."
HOMEPAGE = "https://requests.readthedocs.io"
AUTHOR = "Kenneth Reitz <me@kennethreitz.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/6b/47/c14abc08432ab22dc18b9892252efaf005ab44066de871e72a38d6af464b/requests-2.25.1.tar.gz"
SRC_URI[md5sum] = "514d6f7eba77ada0b8c98ec7818828db"
SRC_URI[sha256sum] = "27973dd4a904a4f13b263a19c866c13b92a39ed1c964655f025f3f8d3d75b804"

S = "${WORKDIR}/requests-2.25.1"

RDEPENDS_${PN} = "python3-chardet python3-idna python3-urllib3 python3-certifi"

inherit setuptools3
