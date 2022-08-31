# meta-jupyter

This layer provides the collection of recipes required to build and run jupyter notebook apps.

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

	Mark Hatle <mark.hatle@amd.com>
	Sandeep Gundlupet Raju <sandeep.gundlupet-raju@amd.com>
	John Toomey <john.toomey@amd.com>

## Dependencies

This layer depends on:

	URI: https://git.openembedded.org/bitbake

	URI: https://git.openembedded.org/openembedded-core
	layers: meta, meta-poky

	URI: https://git.openembedded.org/meta-python2
	branch: master or xilinx current release version (e.g. hosister)

