function corre(){
	var bolt = document.getElementById("cr");
	var i;
	var dist = 0;
	var r = 0;
	var g = 255;
	var b = 0;
	var a = 1;
	
	for(i = 0; i < 255; i++){
		dist = dist + 3;
		r = r + 1;
		g = g - 1;
		b = b + 1;
		bolt.style.transition = "8s";
		bolt.style.color = "rgba(" + r + "," + g + "," + b + "," + a +")";
		bolt.style.marginLeft = dist + "px";
	}
	bolt.setAttribute("onclick", "volta()");
}

function volta(){
	var bolt2 = document.getElementById("cr");
	var dist2 = 765;
	var j;
	var r = 255;
	var g = 0;
	var b = 255;
	var a = 1;
	
	for(j = 0; j < 255; j++){
		dist2 = dist2 - 3;
		r = r - 1;
		g = g + 1;
		b = b - 1;
		bolt2.style.transition = "8s";
		bolt2.style.color = "rgba(" + r + "," + g + "," + b + "," + a +")";
		bolt2.style.marginLeft = dist2 + "px";
	}
	bolt2.setAttribute("onclick", "corre()");
}
