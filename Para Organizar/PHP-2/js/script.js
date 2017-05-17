$(".bttn").on("click", function(){
	$(".atributos").remove();
	var qtdAttr = $(".qtdAtributos").val();
	var tipes = ["int", "float", "double", "String", "char", "long" , "short"];
	var options = "";
	
	for(var j = 0; j < tipes.length; j++){
			options += "<option value=" + tipes[j] + ">" + tipes[j] + "</option>";
	}
	for(var i = 0; i < qtdAttr; i++){
		var html = "<tr class='atributos'>" +
						"<td>" +
							"Atributo " + (i+1) + 
						"</td>" + 
						"<td>" +
							"<select name='attrAcss" + (i+1) + "' class='select1'>" +
								"<option value='public'>public</option>" +
								"<option value='private'>private</option>" +
								"<option value='protected'>protected</option>" +
							"</select>" +
							"<select name='type" + (i+1) + "' class='select2'>" +
								options +
							"</select>" +
							"<input type='text' name='attr" + (i+1) + "' required class='text'>" +
						"</td>" +
					"</tr>";
		$("table").append(html);
	}
});