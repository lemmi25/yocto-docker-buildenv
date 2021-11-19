
SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
HOMEPAGE = "https://github.com/jstasiak/python-zeroconf"
AUTHOR = "Paul Scott-Murphy, William McBrine, Jakub Stasiak <>"
LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=27818cd7fd83877a8e3ef82b82798ef4"

SRC_URI = "https://files.pythonhosted.org/packages/b4/a5/ff02c5af3728816acca71d052cb77c5379b5bc39a20fc1f4994b9d35cfca/zeroconf-0.31.0.tar.gz"
SRC_URI[md5sum] = "d2ee623e6dacd895a926ea374d897120"
SRC_URI[sha256sum] = "53a180248471c6f81bd1fffcbce03ed93d7d8eaf10905c9121ac1ea996d19844"

S = "${WORKDIR}/zeroconf-0.31.0"

RDEPENDS_${PN} = "python3-ifaddr"

inherit setuptools3
