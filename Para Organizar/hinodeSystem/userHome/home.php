<?php require_once "menu/menu.php"; ?>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="../SistemaLogin/css/estilo.css">
	<script src="../SistemaLogin/js/jquery-3.1.1.js"></script>
</head>
<body>
	<?= menu("Menu", ["product/menuProduct.php" => "Produto", "ex2.php" => "Cliente", "ex3.php" => "Vendas"])	?>
</body>
</html>