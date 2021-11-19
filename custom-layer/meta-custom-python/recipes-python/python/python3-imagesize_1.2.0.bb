
SUMMARY = "Getting image size from png/jpeg/jpeg2000/gif file"
HOMEPAGE = "https://github.com/shibukawa/imagesize_py"
AUTHOR = "Yoshiki Shibukawa <yoshiki@shibu.jp>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=0c128f0f7e8a02e1b83884c0b5a41cda"

SRC_URI = "https://files.pythonhosted.org/packages/e4/9f/0452b459c8ba97e07c3cd2bd243783936a992006cf4cd1353c314a927028/imagesize-1.2.0.tar.gz"
SRC_URI[md5sum] = "3a1e124594183778a8f87e4bcdb6dca9"
SRC_URI[sha256sum] = "b1f6b5a4eab1f73479a50fb79fcf729514a900c341d8503d62a62dbc4127a2b1"

S = "${WORKDIR}/imagesize-1.2.0"

RDEPENDS_${PN} = ""

inherit setuptools3
