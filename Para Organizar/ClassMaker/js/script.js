$(".next").on("click", function(){
	$(".attr").remove();
	var number = parseInt($(".number").val());
	var types = ["int", "double", "float", "short", "char", "String", "byte", "long"];
	var i;
	var j;
	for(i = 0; i < number; i++){
		$("#tabela").append("<tr class='attr'>" +
								"<td>" +
									"Variável " + (i+1) + 
								"</td>" +
								"<td>" +
									"<select name='attr" + (i+1) + "' class='acss'>" +
										"<option value='public'>public</option>" +
										"<option value='private'>private</option>" +
										"<option value='protected'>protected</option>" +
									"</select>" +
									"<select class='types' name='type" + (i+1) + "'></select>" +
									"<input type='text' placeholder='Ex: modelo' required name='nome" + (i+1) + "'>" +
								"</td>" +
							"</tr>");
	}
	for(j = 0; j < types.length; j++){
		$(".types").append("<option value='" + types[j] + "'>" + types[j] + "</option>");
	}
});