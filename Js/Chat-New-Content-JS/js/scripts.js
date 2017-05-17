function esconde(){
	var chat = document.getElementById("chat");
	document.getElementById("entrada").style.display = "none";
	document.getElementById("send").style.display = "none";
	document.getElementById("chat").style.display = "none";
	document.getElementById("sumApa").setAttribute("onclick","aparece()");
}
function aparece(){
	var chat = document.getElementById("chat");
	document.getElementById("entrada").style.display ="";
	document.getElementById("send").style.display = "";
	document.getElementById("chat").style.display = "";
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
	document.getElementById("sumApa").style.position = "relative";
	document.getElementById("sumApa").style.bottom= "-10px";
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
	document.getElementById("sumApa").style.position = "";
	document.getElementById("sumApa").style.bottom= "";
	document.getElementById("sumApa").setAttribute("onclick","esconde()");
}
function home(){
	document.getElementById("conteudo").innerHTML = "<h1>" + "Nesta 'div', será carregado um conteúdo." + "</h1>" + "\n" +
	  												"<h2>" + "O que irá acontecer, é incrível." + "</h2>" + "\n" +
	  												"<p>" + "Bom, vamos usar JS, ou JavaScript" + "<br>" +
	  												"para mudar o conteúdo da div, isso irá" + "<br>" +
													"deixar as coisas mais interessantes..." + "</p>";
	document.getElementById("h").style.color = "Yellow";
	document.getElementById("c").style.color = "white";
	document.getElementById("f").style.color = "white";
}

function cadastro(){
	document.getElementById("conteudo").innerHTML = "<div id='cadastro'>" + 
														"<h1 class='titulo'>" + "Agora, cadastre-se." + "</h1>" + "\n" +
														"<p>" + "Nome: " + "<input class='entrada1'>" + "</p>" + "\n" + 
														"<p>" + "Data Nasc: " + "<input class='entrada2'>" + "</p>" + "\n" +
														"<button onclick='concluido()'>" + "Cadastrar" + "</button>" +
													"</div>";
	document.getElementById("h").style.color = "white";
	document.getElementById("c").style.color = "yellow";
	document.getElementById("f").style.color = "white";
}

function concluido(){
	document.getElementById("conteudo").innerHTML = "<div id='cadastroConcluido'>" + 
														"<h1>" + "Cadastro Concluído." + "</h1>" + "\n" +
														"<h2>" + "Parabéns novato." + "</h2>" + "\n" + 
														"<p>" + "User X bem vindo ao clube." + "</p>" + "\n" +
													"</div>";
}

function foto(){
	var fotos = document.getElementById("conteudo");
	document.getElementById("f").style.color ="yellow";
	document.getElementById("h").style.color ="white";
	document.getElementById("c").style.color ="white";
	fotos.innerHTML = "<div id='pics'>" + "<span>" + "As fotos" + "</span>" + "</div>" + "\n" + "<button onclick='slide()' id='but'>" + "Clique Slides" + "</button>";
}
