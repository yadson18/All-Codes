function big(){
	var i;
	var font = document.getElementById("cresce");
	var big = 0;
	for(i = 0; i < 200; i++){
		big = big + 1;
		font.style.fontSize = big + "px";
		font.style.transition = "5s";
	}
}
