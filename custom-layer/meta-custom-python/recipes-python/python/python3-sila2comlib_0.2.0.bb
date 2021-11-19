
SUMMARY = "sila2comlib - a SiLA 2 python3 communication library"
HOMEPAGE = "https://gitlab.com/SiLA2/sila_python"
AUTHOR = "Mark Doerr <mark.doerr@uni-greifswald.de>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=0221a9204780e0cd74c6f55c2fd4d5f1"

SRC_URI = "https://files.pythonhosted.org/packages/d2/11/50d9dc302f6168ce786a84e33816a95cefdfed934a938b01806b72f12d91/sila2comlib-0.2.0.tar.gz"
SRC_URI[md5sum] = "c3c27b6eaa0b494eca62eafadb97f688"
SRC_URI[sha256sum] = "18906d04f7ab557d7b73754515e35a019f5fec08bff01670328838541dda9312"

S = "${WORKDIR}/sila2comlib-0.2.0"

RDEPENDS_${PN} = "python3-pyserial"

inherit setuptools3
