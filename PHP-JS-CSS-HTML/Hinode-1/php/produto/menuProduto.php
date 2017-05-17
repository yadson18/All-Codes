<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Produto</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="utf-8"/>
		<link rel="stylesheet" type="text/css" href="../../css/estilo.css"/>
	</head>
	<body>
		<?php 
			require_once "../../menu/menu2.php"; 
			menu("../vendedor/menuVendedor.php", "Retornar");
		?>
		<ul class="main">
			<li>
				<a href="cadastrar/cadastroProduto.php" class="opt5">Cadastrar Produto</a>
			</li>
			<li>
				<a href="listar/produtosSalvos.php" class="opt3">Listar Produtos</a>
			</li>
			<li>
				<a href="#" class="opt5">Atualizar Produto</a>
			</li>
		</ul>
	</body>
</html>