SUMMARY = "Software to turn the RTL2832U into an SDR"
HOMEPAGE = "http://sdr.osmocom.org/trac/wiki/rtl-sdr"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
DEPENDS = "libusb1"

PV = "0.5.3+git${SRCPV}"

SRC_URI = "git://git.osmocom.org/rtl-sdr"
SRCREV = "6ee557360645da158e3065111349c318894b497b"

S = "${WORKDIR}/git"

inherit autotools pkgconfig lib_package

do_install_append() {
  install -d ${D}${sysconfdir}/udev/rules.d
  install -m0644 ${S}/rtl-sdr.rules ${D}${sysconfdir}/udev/rules.d
}
