function home(){
	document.getElementById("conteudo").innerHTML = "<h1>" + "Nesta 'div', será carregado um conteúdo." + "</h1>" + "\n" +
	  												"<h2>" + "O que irá acontecer, é incrível." + "</h2>" + "\n" +
	  												"<p>" + "Bom, vamos usar JS, ou JavaScript" + "<br>" +
	  												"para mudar o conteúdo da div, isso irá" + "<br>" +
													"deixar as coisas mais interessantes..." + "</p>";
	document.getElementById("conteudos").style.backgroundColor = "white";
	document.getElementById("h").style.color = "Yellow";
	document.getElementById("c").style.color = "white";
	document.getElementById("n").style.color = "white";
}

function cadastro(){
	document.getElementById("conteudo").innerHTML = "<div id='cadastro'>" + 
														"<h1>" + "Agora, cadastre-se." + "</h1>" + "\n" +
														"<p>" + "Nome: " + "<input class='entrada1'>" + "</p>" + "\n" + 
														"<p>" + "Data Nasc: " + "<input class='entrada2'>" + "</p>" + "\n" +
														"<button onclick='concluido()'>" + "Cadastrar" + "</button>" +
													"</div>";
	document.getElementById("conteudos").style.backgroundColor = "rgba(0,0,0,0.8)";
	document.getElementById("h").style.color = "white";
	document.getElementById("c").style.color = "yellow";
	document.getElementById("n").style.color = "white";
}

function concluido(){
	document.getElementById("conteudo").innerHTML = "<div id='cadastroConcluido'>" + 
														"<h1>" + "Cadastro Concluído." + "</h1>" + "\n" +
														"<h2>" + "Parabés novato." + "</h2>" + "\n" + 
														"<p>" + "User X bem vindo ao clube." + "</p>" + "\n" +
													"</div>";
}

function foto(){
	var fotos = document.getElementById("conteudo");
	fotos.innerHTML = "<div id='pics'>" + "<span>" + "As fotos" + "</span>" + "<a href='#' onclick='passar()' id='set'>" + ">" + "</a>" + "</div>";
}

function passar(){
	var foto = document.getElementById("pics");
	foto.style.backgroundColor = "red";
	document.getElementById("set").setAttribute("onclick", "passar2()");
}

function passar2(){
	var foto2 = document.getElementById("pics");
	foto2.style.backgroundColor = "green";
	document.getElementById("set").setAttribute("onclick", "passar3()");
}

function passar3(){
	var foto3 = document.getElementById("pics");
	foto3.style.backgroundColor = "yellow";
	document.getElementById("set").setAttribute("onclick", "passar()");
}
