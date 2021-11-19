
SUMMARY = "This package provides 29 stemmers for 28 languages generated from Snowball algorithms."
HOMEPAGE = "https://github.com/snowballstem/snowball"
AUTHOR = "Snowball Developers <snowball-discuss@lists.tartarus.org>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=19139aaf3c8c8fa1ca6edd59c072fb9f"

SRC_URI = "https://files.pythonhosted.org/packages/a3/3d/d305c9112f35df6efb51e5acd0db7009b74d86f35580e033451b5994a0a9/snowballstemmer-2.1.0.tar.gz"
SRC_URI[md5sum] = "fad6a525534b2da052d1fa820a615100"
SRC_URI[sha256sum] = "e997baa4f2e9139951b6f4c631bad912dfd3c792467e2f03d7239464af90e914"

S = "${WORKDIR}/snowballstemmer-2.1.0"

RDEPENDS_${PN} = ""

inherit setuptools3
