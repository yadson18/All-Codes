setInterval(function(){
	var pass = $(".pass").val();
	var check = $(".checkPass").val();
			
	if((pass != "") && (check != "")){
		if(pass != check){
			$("#submitButton").prop("disabled", true);
			$("p").slideDown();
		}
		else{
			$("#submitButton").prop("disabled", false);
			$("p").slideUp();
		}
	}
	else{
		$("p").slideUp();
	}
}, 100);