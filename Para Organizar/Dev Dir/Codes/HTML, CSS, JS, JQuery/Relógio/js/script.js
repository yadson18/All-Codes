//Scripts do relógio

function relogio() {
	var time = new Date();
	var hora = time.getHours();
	var minutos = time.getMinutes();
	var segundos = time.getSeconds();
			
	if(hora < 10){
		hora = "0" + hora;
	}
	if(minutos < 10){
		minutos = "0" + minutos;
	}
	if(segundos < 10){
		segundos = "0" + segundos;
	}
			
	document.getElementById("horas").style.width = (4.35 * hora) + "%";
	document.getElementById("minutos").style.width = (1.70 * minutos) + "%";
	document.getElementById("segundos").style.width = (1.70 * segundos) + "%";
 	document.getElementById("time").innerHTML = hora+":"+minutos+":"+segundos;
}

function time1(){
	setInterval(relogio, 100);
}

/*---------------------------------------------------------------------------------*/

//Scripts do cronômetro

var minutos = 0;
var segundos = 0;
var decimos= 0;
var min, sec, dec;

function cronometro(){
    decimos += 1;
  	var d  = decimos;
  	var s = segundos;
  	var m = minutos;

	if(decimos < 11){
  		if(decimos == 9){
    		decimos = 0;
    		segundos += 1;
  		}
	}

	if(segundos < 61){
 		if(segundos < 10){
   			s = "0" + segundos;
 		}
 		if(segundos == 60){
    		segundos = 0;
    		minutos += 1;
  		}
	}
	if(minutos < 61){
 		if(minutos < 10){
   			m = "0" + minutos;
 		}
 		if(minutos == 60){
    		minutos = 0;
  		}
	}
	document.getElementById("iniciar").innerHTML = m + ":" + s + ":" + d;
}

function time(){
	setInterval(cronometro, 100);
}

function iniciar(){
	minutos = 0;
	segundos = 0;
	decimos = 0;
	document.getElementById("button1").setAttribute("onclick", "parar()");
	document.getElementById("button1").innerHTML = "<img src='img/pause.png'>";
	document.getElementById("button2").setAttribute("onclick", "zerar()");
	document.getElementById("button2").innerHTML = "<img src='img/reload.png'>";
	document.getElementById("zero").setAttribute("id", "iniciar");
}

function parar(){
	var d  = decimos;
	var s = segundos;
	var m = minutos;
	dec = decimos;
	sec = segundos;
	min = minutos;

	if(minutos < 10){
  		m = "0" + minutos;
	}
	if(segundos < 10){
  		s = "0" + segundos;
	}
	document.getElementById("button1").style.display = "none";
	document.getElementById("iniciar").setAttribute("id", "parar");
	document.getElementById("button3").setAttribute("onclick", "retomar()");
	document.getElementById("button3").innerHTML = "<img src='img/play.png'>";
	document.getElementById("button2").setAttribute("onclick", "zerar(1)");
	document.getElementById("parar").innerHTML = m + ":" + s + ":" + d;
}

function zerar(a){
	if(a == 1){
  		document.getElementById("parar").setAttribute("id", "zero");
  		document.getElementById("zero").innerHTML = "00:00:0";
  		document.getElementById("button1").setAttribute("onclick", "iniciar()");
  		document.getElementById("button1").innerHTML = "<img src='img/play.png'>";
  		document.getElementById("button1").style.display = "";
  		document.getElementById("button2").innerHTML = "";
  		document.getElementById("button3").innerHTML = "";
	}
	else{
		document.getElementById("iniciar").setAttribute("id", "zero");
		document.getElementById("zero").innerHTML = "00:00:0";
		document.getElementById("button1").setAttribute("onclick", "iniciar()");
		document.getElementById("button1").innerHTML = "<img src='img/play.png'>";
		document.getElementById("button1").style.display = "";
		document.getElementById("button2").innerHTML = "";
		document.getElementById("button3").innerHTML = "";
	}
}

function retomar(){
	minutos = min;
	segundos = sec;
	decimos = dec;
	document.getElementById("button3").innerHTML = "";
	document.getElementById("button1").style.display = "";
	document.getElementById("parar").setAttribute("id", "iniciar");
}

function chamadaCronometro(){
	document.getElementById("conteudo").innerHTML = "<div id='zero' class='display'>00:00:0</div>" +
													"<a onclick='iniciar()' id='button1'><img src='img/play.png'></a>" +
													"<a id='button3'></a>" +
													"<a id='button2'></a>";
	document.getElementById("tempo").onload = time();
	document.getElementById("r").style.color = "";
	document.getElementById("r").style.fontSize = "";
	document.getElementById("c").style.color = "purple";
	document.getElementById("c").style.fontSize = "23px";
}

function chamadaRelogio(){
	document.getElementById("conteudo").innerHTML = "<div class='showTime'>" +
													"<span id='time'>Relógio</span>" +
													"</div>" +
													"<br><div class='timeDiv'>" +
													"<div id='horas'>HORAS</div>" +
													"</div>" +
													"<div class='timeDiv'>" + 
													"<div id='minutos'>MINUTOS</div>" +
													"</div>" +
													"<div class='timeDiv'>" + 
													"<div id='segundos'>SEGUNDOS</div>" +
													"</div>";
	document.getElementById("tempo").onload = time1();	
	document.getElementById("r").style.color = "purple";
	document.getElementById("r").style.fontSize = "23px";
	document.getElementById("c").style.color = "";
	document.getElementById("c").style.fontSize = "";
}
	
	
	
	