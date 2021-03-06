SUMMARY = "An FM radio provider service"
HOMEPAGE = "https://github.com/PDXostc/${PN}"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "gstreamer1.0 libsndfile1 fftwf rtl-sdr libsamplerate0"
RDEPENDS_${PN} = "gstreamer1.0-plugins-good-pulse"

SRC_URI = "git://github.com/PDXostc/${PN}.git;protocol=https"
SRCREV = "cb1e1472cd55c148c816835f2e1fb063db00eb24"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

FILES_${PN} += " \
  ${datadir}/dbus-1/services/com.jlr.fmradioservice.service \
  ${libdir}/gstreamer-1.0/libgstsdrjfm.so \
  ${bindir}/fmradioservice \
  ${libdir}/systemd/user/fmradioservice.service \
  "

FILES_${PN}-dev += " \
  ${libdir}/gstreamer-1.0/libgstsdrjfm.la \
  "

FILES_${PN}-staticdev += " \
  ${libdir}/gstreamer-1.0/libgstsdrjfm.a \
  "

FILES_${PN}-dbg += " \
  ${libdir}/gstreamer-1.0/.debug \
  "
