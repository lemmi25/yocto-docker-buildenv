
SUMMARY = "Protocol Buffers"
HOMEPAGE = "https://developers.google.com/protocol-buffers/"
AUTHOR = " <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b"

SRC_URI = "https://files.pythonhosted.org/packages/37/52/4e40f7513b44671817a92dc566f4a6e8eba65bfc94f79da23186e6c127ce/protobuf-3.19.1.tar.gz"
SRC_URI[md5sum] = "ccb223d37ac3a7277d7ac0b067ed2a54"
SRC_URI[sha256sum] = "62a8e4baa9cb9e064eb62d1002eca820857ab2138440cb4b3ea4243830f94ca7"

S = "${WORKDIR}/protobuf-3.19.1"

RDEPENDS_${PN} = ""

inherit setuptools3
