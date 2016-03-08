SUMMARY = "An FM radio provider service"
HOMEPAGE = "https://github.com/PDXostc/${PN}"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
DEPENDS = "gstreamer1.0 libsndfile1 fftwf rtl-sdr libsamplerate0"

SRC_URI = "git://github.com/PDXostc/${PN}.git;protocol=https"
SRCREV = "60af571111742c76578a42a377bbdf95e350b5ef"

S = "${WORKDIR}/git"

inherit autotools pkgconfig systemd

do_unpack_append() {
    bb.build.exec_func('do_create_m4', d)
}

do_create_m4() {
    pushd ${S}
    mkdir gst-sdr-j-fm/m4
    popd
}

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
