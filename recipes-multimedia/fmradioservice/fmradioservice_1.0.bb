SUMMARY = "An FM radio provider service"
HOMEPAGE = "https://github.com/PDXostc/${PN}"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "gstreamer1.0 libsndfile1 fftwf rtl-sdr libsamplerate0"

SRC_URI = "git://github.com/PDXostc/${PN}.git;protocol=https;tag=v${PV}"

inherit autotools pkgconfig

FILES_${PN} += " \
  /lib/systemd/system/fmradioservice.service \
  /usr/lib/gstreamer-1.0/libgstsdrjfm.so \
  "
