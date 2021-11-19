
SUMMARY = "Protocol Buffers"
HOMEPAGE = "https://developers.google.com/protocol-buffers/"
AUTHOR = " <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=0823d69ba307e4bab0f4b2f2ae4a6c49"

SRC_URI = "https://files.pythonhosted.org/packages/3d/64/a3b379cb9c7827ad33c67dcda4c4ad117bdef1b7d68b22a05c963cf4727d/protobuf-3.17.3.tar.gz"
SRC_URI[md5sum] = "03728f8c4d6d67ac9e0017f227a29538"
SRC_URI[sha256sum] = "72804ea5eaa9c22a090d2803813e280fb273b62d5ae497aaf3553d141c4fdd7b"

S = "${WORKDIR}/protobuf-3.17.3"

RDEPENDS_${PN} = "python3-six"

inherit setuptools3
