# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Python implementation of the SiLA 2 standard for lab automation"
HOMEPAGE = "https://gitlab.com/sila2/sila_python"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d9ba4a5286ebedfadc8014cd5bd85ba0 \
                    file://sila_base/LICENSE;md5=a84b005812a42482472e67db8be8405a"

SRC_URI = "gitsm://gitlab.com/SiLA2/sila_python.git;protocol=https;branch=master"

# Modify these as desired
PV = "0.1.0+git${SRCPV}"
SRCREV = "773408956f2f4fa81eeb9e9e9bf1ced0d4b065b7"

S = "${WORKDIR}/git"

inherit setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-asyncio python3-core python3-datetime python3-grpcio python3-io python3-jinja2 python3-json python3-logging python3-lxml python3-math python3-misc python3-netclient python3-protobuf python3-pytest python3-sila2lib python3-threading python3-typing python3-unittest python3-zeroconf"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    discovery
#    error_handling
#    jsonschema
#    lxml.etree
#    metadata
#    observable_command
#    observable_property
#    sila2.pb2_stubs.SiLABinaryTransfer_pb2
#    sila2.pb2_stubs.SiLAFramework_pb2
#    sila2_example_server
#    sila2_example_server.generated.delayprovider
#    src.sila2.features.silaservice.silaservice_client
#    unobservables
#    xmlschema
