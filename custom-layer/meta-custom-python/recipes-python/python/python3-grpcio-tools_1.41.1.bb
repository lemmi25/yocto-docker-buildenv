
SUMMARY = "Protobuf code generator for gRPC"
HOMEPAGE = "https://grpc.io"
AUTHOR = "The gRPC Authors <grpc-io@googlegroups.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://setup.py;md5=34fe2b5d605c71ace42d946a6959b362"

SRC_URI = "https://files.pythonhosted.org/packages/3c/9b/cf7092cbcf60930f36a204301640be0b95470d358cd53b57c84578cbb16c/grpcio-tools-1.41.1.tar.gz"
SRC_URI[md5sum] = "996aed341f805fc5018cd8eb861c6f6b"
SRC_URI[sha256sum] = "f16e4c63996ca8fe0af1eb9c4a07e5207874c4a69f890ccb824cd858521d981f"

S = "${WORKDIR}/grpcio-tools-1.41.1"

RDEPENDS_${PN} = "python3-protobuf python3-grpcio python3-setuptools"

inherit setuptools3
