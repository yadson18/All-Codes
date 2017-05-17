function game(gameName){
	var methods = {
		'name': function(){
			return gameName;
		},
		'start': {
			'play': 'Oi'
		}
	};
	
	return methods;
}

var game = new game("Jogo da forca");

alert(game.name());

/*function soma(number){
	var n = "Não é par";
	if((number % 2) === 0){
		n = (1 + number) * (number / 2);
	}
	
	return n;
}

document.getElementById("content").innerHTML = soma(10);
*/
/*
$("#msg").slideUp();

	$(".check").on("keyup", function(event){
		if(($("#check1").val() != "") && ($("#check2").val() != "")){
			if($("#check1").val() === $("#check2").val()){
				$("#msg").slideUp();
			}
			else{
				$("#msg").slideDown();
			}
		}
		else{
			$("#msg").slideUp();
		}
	});
*/