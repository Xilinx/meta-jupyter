# meta-jupyter

This layer collects recipes required to build and run jupyter notebook on yocto

## Maintainers, Patches/Submissions, Community

Please open pull requests for any changes.

For more details follow the OE community patch submission guidelines, as described in:

https://www.openembedded.org/wiki/Commit_Patch_Message_Guidelines
https://www.openembedded.org/wiki/How_to_submit_a_patch_to_OpenEmbedded

When creating patches, please use below format.

**Syntax:**
`git format-patch -s --subject "meta-jupyter][<release-version>][PATCH" -1`

**Example:**
`git format-patch -s --subject "meta-jupyter][rel-v2022.1][PATCH" -1`

**Maintainers:**

	Mark Hatle <mark.hatle@xilinx.com>
	Sandeep Gundlupet Raju <sandeep.gundlupet-raju@xilinx.com>
	John Toomey <john.toomey@xilinx.com>


## Dependencies


	URI: git://git.openembedded.org/bitbake

	URI: git://git.openembedded.org/openembedded-core

	URI: git://git.openembedded.org/meta-openembedded
	layers: meta
	branch: master or xilinx current release version (e.g. hosister)
