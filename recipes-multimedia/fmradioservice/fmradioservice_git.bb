SUMMARY = "An FM radio provider service"
HOMEPAGE = "https://github.com/PDXostc/${PN}"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-good-pulse libsndfile1 fftwf rtl-sdr libsamplerate0"

SRC_URI = "git://github.com/PDXostc/${PN}.git;protocol=https"
SRCREV = "cf3655f933b737c9b5be6aeeb47f7801f09779f9"

S = "${WORKDIR}/git"

inherit autotools pkgconfig systemd

FILES_${PN} += " \
  ${datadir}/dbus-1/services/com.jlr.fmradioservice.service \
  ${libdir}/gstreamer-1.0/libgstsdrjfm.so \
  ${bindir}/fmradioservice \
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

SYSTEMD_SERVICE_${PN} = " \
  fmradioservice.service \
  "
