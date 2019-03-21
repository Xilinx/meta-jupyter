DESCRIPTION = "Python packages to build jupyter notebook"

inherit packagegroup

RDEPENDS_${PN} = "  \
	python3-pyzmq \
	python3-defusedxml \
	python3-bleach \
	python3-backcall \
	python3-six \
	python3-entrypoints \
	python3-send2trash \
	python3-matplotlib \
	python3-tornado \
	python3-prompt-toolkit2 \
	python3-singledispatch \
	python3-backports-shutil-get-terminal-size \
	python3-sympy \
	python3-parso \
	python3-jupyter \
	python3-qtconsole \
	python3-scandir \
	python3-prometheus-client \
	python3-mpmath \
	python3-nbconvert \
	python3-webencodings \
	python3-dateutil \
	python3-jupyterlab-server \
	python3-pygments \
	python3-nbformat \
	python3-jupyter-console \
	python3-jedi \
	python3-jupyterlab \
	python3-ipython-genutils \
	python3-widgetsnbextension \
	python3-decorator \
	python3-configparser \
	python3-jupyter-core \
	python3-mistune \
	python3-notebook \
	python3-jupyter-client \
	python3-ipython \
	python3-pickleshare \
	python3-ipywidgets \
	python3-terminado \
	python3-testpath \
	python3-ipykernel \
	python3-wcwidth \
	python3-ptyprocess \
	python3-pathlib2 \
	python3-jsonschema \
	python3-simplegeneric \
	python3-pandocfilters \
	python3-traitlets \
	python3-matplotlib \
	"
