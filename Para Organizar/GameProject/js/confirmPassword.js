setInterval(function(){
	var pass = $(".pass").val();
	var check = $(".checkPass").val();
			
	if((pass != "") && (check != "")){
		if(pass != check){
			$("#submitButton").prop("disabled", true);
			$("#submitButton").css("background-color", "gray");
			$(".incorrectPwd").slideDown();
		}
		else{
			$("#submitButton").prop("disabled", false);
			$("#submitButton").css("background-color", "#008fff");
			$(".incorrectPwd").slideUp();
		}
	}
	else{
		$(".incorrectPwd").slideUp();
		$("#submitButton").css("background-color", "#008fff");
	}
}, 100);