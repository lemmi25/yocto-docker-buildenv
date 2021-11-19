
SUMMARY = "Easy-to-use Modbus RTU and Modbus ASCII implementation for Python"
HOMEPAGE = "https://github.com/pyhys/minimalmodbus"
AUTHOR = "Jonas Berg <>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=27da4ba4e954f7f4ba8d1e08a2c756c4"

SRC_URI = "https://files.pythonhosted.org/packages/78/99/8cd22b4465e697bae2b02fd06aaccd4c5cdfbb18945d728db99f23d71df9/minimalmodbus-2.0.1.tar.gz"
SRC_URI[md5sum] = "3fe320f7be761b6a2c3373257c431c31"
SRC_URI[sha256sum] = "cf873a2530be3f4b86467c3e4d47b5f69fd345d47451baca4adbf59e2ac36d00"

S = "${WORKDIR}/minimalmodbus-2.0.1"

RDEPENDS_${PN} = "python3-pyserial"

inherit setuptools3
