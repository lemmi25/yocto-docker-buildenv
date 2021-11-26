
SUMMARY = "Wrapper package for OpenCV python bindings."
HOMEPAGE = "https://github.com/skvark/opencv-python"
AUTHOR = " <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=c4a59ea6fdfe49caa8470881ba0a6ffa"

SRC_URI = "https://files.pythonhosted.org/packages/bc/b6/e447d0302bc328f06b56dabd6742648372df63446725db56058a259dbda2/opencv-python-4.5.4.60.tar.gz"
SRC_URI[md5sum] = "afd507563c73629835a18042d4f31974"
SRC_URI[sha256sum] = "f609558a8fe1bf66f6c81816ca14d8e51500c8b53ee44bc644c73f98f1c5655e"

S = "${WORKDIR}/opencv-python-4.5.4.60"

RDEPENDS_${PN} = "python3-numpy"

inherit setuptools3
