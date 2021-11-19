
SUMMARY = "HTTP/2-based RPC framework"
HOMEPAGE = "https://grpc.io"
AUTHOR = "The gRPC Authors <grpc-io@googlegroups.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/bd/81/6c704c002a992b9d6466c739e3e7687e0bb2365d8cd63d7fc8e95d502cb6/grpcio-1.41.1.tar.gz"
SRC_URI[md5sum] = "3b2036f8300c444d635102aea0bcaa76"
SRC_URI[sha256sum] = "9b751271b029432a526a4970dc9b70d93eb6f0963b6a841b574f780b72651969"

S = "${WORKDIR}/grpcio-1.41.1"

RDEPENDS_${PN} = "python3-six"

inherit setuptools3
