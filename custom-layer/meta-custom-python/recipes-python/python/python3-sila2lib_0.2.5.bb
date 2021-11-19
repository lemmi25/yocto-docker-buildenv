
SUMMARY = "sila2lib - a SiLA 2 python3 library"
HOMEPAGE = "https://gitlab.com/SiLA2/sila_python"
AUTHOR = "Mark Doerr, Timm Severin, Lukas Bromig, Florian Meinicke, Robert Giessmann, Maximilian Schulz (max@unitelabs.ch) <mark.doerr@uni-greifswald.de>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=a2174c3565538542e148368b566e7525"

SRC_URI = "https://files.pythonhosted.org/packages/ec/c4/49577152f9f2b329c7249901d2f167c74e2c0450ae5a64fbfe301752ed36/sila2lib-0.2.5.tar.gz"
SRC_URI[md5sum] = "588b3ca6a3045abc5cef1e3e751ea17a"
SRC_URI[sha256sum] = "84630ef1a630f39499f68813a61977e0ae22528e6223bfd1ff06b923713eba24"

S = "${WORKDIR}/sila2lib-0.2.5"

RDEPENDS_${PN} = "python3-wheel python3-grpcio python3-grpcio-tools python3-lxml python3-zeroconf"

inherit setuptools3
