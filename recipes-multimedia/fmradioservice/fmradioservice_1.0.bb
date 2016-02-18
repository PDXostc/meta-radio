SUMMARY = "An FM radio provider service"
HOMEPAGE = "https://github.com/PDXostc/${PN}"
LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "gstreamer-1.0 libusb-1.0 sndfile fftw3 librtlsdr samplerate"

SRC_URI = "https://github.com/PDXostc/${PN}/releases/download/v${PV}/${PN}-${PV}.tar.xz"
SRC_URI[md5sum] = "01b3bb6dc47cb7771aa192b907cb5828"
SRC_URI[sha256sum] = "f7f7a62060bb1c0ef1b319f55581ec12d9da8658b4babdabb0d375f285ca5283"

inherit autotools pkgconfig
