
SUMMARY = "Pure Python Multicast DNS Service Discovery Library (Bonjour/Avahi compatible)"
HOMEPAGE = "https://github.com/jstasiak/python-zeroconf"
AUTHOR = "Paul Scott-Murphy, William McBrine, Jakub Stasiak <>"
LICENSE = "LGPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=3bb705b228ea4a14ea2728215b780d80"

SRC_URI = "https://files.pythonhosted.org/packages/cc/66/4b509ea71cf2daf2e590eb1194753b26ee0a593ecbab85dcf1838bac3073/zeroconf-0.36.12.tar.gz"
SRC_URI[md5sum] = "3bbdffeb96f94919da2a4e8918dce233"
SRC_URI[sha256sum] = "1f1994f550abfeda10a9d5924c7e5b463213ea5ca87198da751c74995f59e780"

S = "${WORKDIR}/zeroconf-0.36.12"

RDEPENDS_${PN} = "python3-ifaddr"

inherit setuptools3
