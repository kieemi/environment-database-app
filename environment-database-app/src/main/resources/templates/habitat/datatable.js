$(document).ready( function () {
	 var table = $('#habitatsTable').DataTable({
			"sAjaxSource": "/habitats",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
				{ "mData": "guid"},
				{ "mData": "nameOfNatura2000Site" },
				{ "mData": "observationDate" },
				{ "mData": "estimatedMappingPrecissionInMeters" },
				{ "mData": "dataSource" },
				{ "mData": "comment" }
			]
	 })
});