# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A package to control the Mecademic robots through python"
HOMEPAGE = "https://github.com/Mecademic/mecademicpy"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bdd86124c5613845b719f48293d8081d"

SRC_URI = "git://github.com/lemmi25/mecademicpy.git;protocol=https;branch=master"

# Modify these as desired
PV = "1.1.0+git${SRCPV}"
SRCREV = "0a2ca9796b7fe4295b260f3a0d766fe2f34b484e"

S = "${WORKDIR}/git"

inherit setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-core python3-io python3-json python3-logging python3-misc python3-requests python3-threading python3-typing"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    dataclasses_json
#    pandas
