DESCRIPTION = "Python packages to build jupyter notebook for Python 2.x"

inherit packagegroup

RDEPENDS_${PN} = "  \
        python-backcall \
        python-jupyterlab-server \
        python-pyzmq \
        python-bleach \
        python-jupyterlab \
        python-qtconsole \
        python-configparser \
        python-matplotlib \
        python-scandir \
        python-dateutil \
        python-mistune \
        python-send2trash \
        python-decorator \
        python-mpmath \
        python-simplegeneric \
        python-defusedxml \
        python-nbconvert \
        python-singledispatch \
        python-entrypoints \
        python-nbformat \
        python-six \
        python-ipykernel \
        python-notebook \
        python-sympy \
        python-ipython-genutils \
        python-pandocfilters \
        python-terminado \
        python-ipython \
        python-parso \
        python-testpath \
        python-ipywidgets \
        python-pathlib2 \
        python-tornado \
        python-jedi \
        python-pickleshare \
        python-traitlets \
        python-jsonschema \
        python-prometheus-client \
        python-wcwidth \
        python-jupyter-client \
        python-prompt-toolkit2 \
        python-webencodings \
        python-jupyter-console \
        python-ptyprocess \
        python-widgetsnbextension   \
        python-jupyter-core \
        python-pygments \
        zeromq \
        python-jupyter \
"
