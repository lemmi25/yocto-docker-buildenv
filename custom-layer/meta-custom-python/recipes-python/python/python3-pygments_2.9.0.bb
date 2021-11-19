
SUMMARY = "Pygments is a syntax highlighting package written in Python."
HOMEPAGE = "https://pygments.org/"
AUTHOR = "Georg Brandl <georg@python.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98419e351433ac106a24e3ad435930bc"

SRC_URI = "https://files.pythonhosted.org/packages/ba/6e/7a7c13c21d8a4a7f82ccbfe257a045890d4dbf18c023f985f565f97393e3/Pygments-2.9.0.tar.gz"
SRC_URI[md5sum] = "665516d1d1c0099241ab6e4c057e26be"
SRC_URI[sha256sum] = "a18f47b506a429f6f4b9df81bb02beab9ca21d0a5fee38ed15aef65f0545519f"

S = "${WORKDIR}/Pygments-2.9.0"

RDEPENDS_${PN} = ""

inherit setuptools3
