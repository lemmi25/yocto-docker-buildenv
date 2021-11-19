
SUMMARY = "A configurable sidebar-enabled Sphinx theme"
HOMEPAGE = "https://alabaster.readthedocs.io"
AUTHOR = "Jeff Forcier <jeff@bitprophet.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da053683d66d543813a727e8a30c96ca"

SRC_URI = "https://files.pythonhosted.org/packages/cc/b4/ed8dcb0d67d5cfb7f83c4d5463a7614cb1d078ad7ae890c9143edebbf072/alabaster-0.7.12.tar.gz"
SRC_URI[md5sum] = "3591827fde96d1dd23970fb05410ed04"
SRC_URI[sha256sum] = "a661d72d58e6ea8a57f7a86e37d86716863ee5e92788398526d58b26a4e4dc02"

S = "${WORKDIR}/alabaster-0.7.12"

RDEPENDS_${PN} = ""

inherit setuptools3
