
SUMMARY = "Internationalized Domain Names in Applications (IDNA)"
HOMEPAGE = "https://github.com/kjd/idna"
AUTHOR = "Kim Davies <kim@cynosure.com.au>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=cf36c8682cc154d2d4aa57bd6246b9a1"

SRC_URI = "https://files.pythonhosted.org/packages/ea/b7/e0e3c1c467636186c39925827be42f16fee389dc404ac29e930e9136be70/idna-2.10.tar.gz"
SRC_URI[md5sum] = "7a910c706db30d758f377db2762c0f9a"
SRC_URI[sha256sum] = "b307872f855b18632ce0c21c5e45be78c0ea7ae4c15c828c20788b26921eb3f6"

S = "${WORKDIR}/idna-2.10"

RDEPENDS_${PN} = ""

inherit setuptools3
