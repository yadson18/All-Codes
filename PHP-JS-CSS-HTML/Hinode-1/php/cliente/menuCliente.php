<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Cliente</title>
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
				<a href="cadastrar/cadastroCliente.php" class="opt3">Cadastrar Cliente</a>
			</li>
			<li>
				<a href="listar/clientesSalvos.php" class="opt4">Listar Clientes</a>
			</li>
			<li>
				<a href="atualizar/atualizarCadastro.php" class="opt5">Atualizar Cadastro</a>
			</li>
		</ul>
	</body>
</html>