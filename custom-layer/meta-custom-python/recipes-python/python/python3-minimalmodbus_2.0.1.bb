SUMMARY = "Easy-to-use Modbus RTU and Modbus ASCII implementation for Python"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENCE;md5=27da4ba4e954f7f4ba8d1e08a2c756c4"

RDEPENDS_${PN} = "${PYTHON_PN}-pyserial"

SRCNAME = "minimalmodbus"
SRC_URI = "https://pypi.python.org/packages/source/m/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "3fe320f7be761b6a2c3373257c431c31"
SRC_URI[sha256sum] = "cf873a2530be3f4b86467c3e4d47b5f69fd345d47451baca4adbf59e2ac36d00"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit distutils3