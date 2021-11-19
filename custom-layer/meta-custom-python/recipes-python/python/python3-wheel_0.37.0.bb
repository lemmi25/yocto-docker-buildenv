
SUMMARY = "A built-package format for Python"
HOMEPAGE = "https://github.com/pypa/wheel"
AUTHOR = "Daniel Holth <dholth@fastmail.fm>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9d66b41bc2a080e7174acc5dffecd752"

SRC_URI = "https://files.pythonhosted.org/packages/4e/be/8139f127b4db2f79c8b117c80af56a3078cc4824b5b94250c7f81a70e03b/wheel-0.37.0.tar.gz"
SRC_URI[md5sum] = "79f55b898e6f274f5586bbde39f6fe8e"
SRC_URI[sha256sum] = "e2ef7239991699e3355d54f8e968a21bb940a1dbf34a4d226741e64462516fad"

S = "${WORKDIR}/wheel-0.37.0"

RDEPENDS_${PN} = ""

inherit setuptools3
