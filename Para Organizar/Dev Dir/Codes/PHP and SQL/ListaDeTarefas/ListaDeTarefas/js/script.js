$(".botao").on("click", function(){
	setTimeout(function(){
		$(".input").val("");
	}, 0);
});
$(".opt1").on("click", function(){
	$("body").load("cadastroTarefa.php");
});
$(".opt2").on("click", function(){
	$("body").load("tarefasSalvas.php");
});
$(".opt3").on("click", function(){
	$("body").load("modificarTarefa.php");
});
$(".opt4").on("click", function(){
	$("body").load("excluirTarefa.php");
});
$(".drop").on("click", function(){
	var valor = $(".slCodigo").val();
	console.log(valor);
	if(valor !== null){
		$("#json").load("getTarefa.php", {acc:valor});
		setTimeout(function(){
			$(".id").val(json["codigo"]);
			$(".nome").val(json["nome"]);
			$(".data").val(json["data"]);
			$(".hora").val(json["hora"]);
			$(".slStatus").val(json["status"]);
			$(".userId").val(json["userId"]);
			$(".formModificar").toggle();
			$(".formModificar").slideDown();
		}, 200);
	}
});