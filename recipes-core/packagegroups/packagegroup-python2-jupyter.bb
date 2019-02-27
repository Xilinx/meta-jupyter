DESCRIPTION = "Python packages to build jupyter notebook"

inherit packagegroup

RDEPENDS_${PN} = "  \
	python-jupyterlab \
	python-matplotlib \
	python-pillow \
	python-pydot \
	python-numpy \
	python-psutil \
	python-pandas \
	python-ipywidgets \
	python-pyserial \
	python-threading \
	python-shell \
	python-scons \
	python-multiprocessing \
	python-pip \
	"
