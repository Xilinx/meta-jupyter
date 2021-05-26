DESCRIPTION = "Python packages to build jupyter notebook"

inherit packagegroup

RDEPENDS_${PN} = "  \
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
	"
