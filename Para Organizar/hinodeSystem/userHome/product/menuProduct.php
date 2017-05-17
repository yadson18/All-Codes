<?php 
	require_once "../menu/menu.php"; 
	require_once "../class/TagHtml.php";
?>
<!DOCTYPE html>
<html>
<head>
		<title>Produto Menu</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<?= TagHtml::css("estilo.css") ?>
		<?= TagHtml::script("jquery-3.1.1.js") ?>
</head>
<body>
	 <?= menu("Produto", ["forms/add.php" => "Adicionar", "forms/view.php" => "Listar", "forms/update.php" => "Atualizar", "forms/delete.php" => "Excluir"])	?>
</body>
</html>