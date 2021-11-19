
SUMMARY = "Easily download, build, install, upgrade, and uninstall Python packages"
HOMEPAGE = "https://github.com/pypa/setuptools"
AUTHOR = "Python Packaging Authority <distutils-sig@python.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

SRC_URI = "https://files.pythonhosted.org/packages/1e/00/05f51ceab8d3b9be4295000d8be4c830c53e5477755888994e9825606cd9/setuptools-58.5.3.tar.gz"
SRC_URI[md5sum] = "04402d15308fb70de2de4a1c537ade1f"
SRC_URI[sha256sum] = "dae6b934a965c8a59d6d230d3867ec408bb95e73bd538ff77e71fedf1eaca729"

S = "${WORKDIR}/setuptools-58.5.3"

RDEPENDS_${PN} = ""

inherit setuptools3
