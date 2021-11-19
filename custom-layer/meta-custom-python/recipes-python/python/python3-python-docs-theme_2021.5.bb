
SUMMARY = "The Sphinx theme for the CPython docs and related projects"
HOMEPAGE = "https://github.com/python/python-docs-theme/"
AUTHOR = "PyPA <distutils-sig@python.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37b80d5594ba2b69a1ddbcfe8e2cd9c3"

SRC_URI = "https://files.pythonhosted.org/packages/ef/4d/c8cda10f129ac964e60e77b6a0b138a1d61daeaafa8f23e51d167be52042/python-docs-theme-2021.5.tar.gz"
SRC_URI[md5sum] = "77e2c1f5fced3273dd1a5f5dfbbdffec"
SRC_URI[sha256sum] = "4a58254fe89535a4d9404fa006970a900211ab63202fd52f22478dedf1200a2f"

S = "${WORKDIR}/python-docs-theme-2021.5"

RDEPENDS_${PN} = ""

inherit setuptools3
