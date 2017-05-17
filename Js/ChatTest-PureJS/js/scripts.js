function esconde(){
	var chat = document.getElementById("chat");
	document.getElementById("entrada").style.display = "none";
	document.getElementById("send").style.display = "none";
	chat.style.display = "none";
	document.getElementById("sumApa").setAttribute("onclick","aparece()");
}
function aparece(){
	var chat = document.getElementById("chat");
	document.getElementById("entrada").style.display ="";
	document.getElementById("send").style.display = "";
	chat.style.display = "";
	document.getElementById("sumApa").setAttribute("onclick","esconde()");
}

function fecha(){
	var caixa = document.getElementById("box");
	caixa.style.height = "70px";
	caixa.style.width = "70px";
	caixa.style.position = "fixed";
	caixa.style.borderRadius ="50%";
	var chat = document.getElementById("chat");
	document.getElementById("entrada").style.display = "none";
	document.getElementById("send").style.display = "none";
	document.getElementById("status").style.display ="none";
	document.getElementById("sair").style.display="none";
	chat.style.display = "none";
	caixa.style.top = "10px";
	document.getElementById("sumApa").setAttribute("onclick","abre()");
}

function abre(){
	var caixa = document.getElementById("box");
	caixa.style.height = "";
	caixa.style.width = "";
	caixa.style.position = "";
	caixa.style.borderRadius ="";
	var chat = document.getElementById("chat");
	document.getElementById("entrada").style.display = "";
	document.getElementById("send").style.display = "";
	document.getElementById("status").style.display ="";
	document.getElementById("sair").style.display="";
	chat.style.display = "";
	caixa.style.top = "";
	document.getElementById("sumApa").setAttribute("onclick","esconde()");
}
