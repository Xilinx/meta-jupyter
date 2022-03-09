DESCRIPTION = "Python packages to build jupyter notebook"

inherit packagegroup

RDEPENDS:${PN} = "  \
	python3-jupyterlab \
	python3-jupyterlab_widgets \
	python3-matplotlib \
	python3-pillow \
	python3-pydot \
	python3-numpy \
	python3-psutil \
	python3-pandas \
	python3-ipywidgets \
	python3-requests \
	python3-jupyter_server \
	python3-jupyterlab_server \
	python3-anyio \
	python3-sniffio \
	python3-nbclassic \
	python3-bokeh \
	python3-nbclient \
	python3-charset-normalizer \
	python3-nest-asyncio \
	python3-websocket-client \
	python3-jupyterlab-pygments \
	python3-matplotlib-inline \
	python3-argon2-cffi \
	python3-argon2-cffi-bindings \
	"
