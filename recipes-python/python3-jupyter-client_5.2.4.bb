inherit pypi setuptools3
require python-jupyter-client.inc

do_install_append () {
  if [ find ${D}/usr/bin -name "jupyter*" &> /dev/null ]; then
    for f in ${D}/usr/bin/jupyter*; do sed -i -e 's:env python$:env python3:' $f; done
  fi
}
