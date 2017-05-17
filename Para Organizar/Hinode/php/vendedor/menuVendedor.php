<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Vendedor Hinode</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="utf-8"/>
		<link rel="stylesheet" type="text/css" href="../../css/estilo.css"/>
	</head>
	<body>
		<?php 
			require_once "../../menu/menu2.php"; 
			session_start();
			menu("sair.php", "Sair");
			
			if(!isset($_SESSION["uid"])){
				header("Location: login.php");
			}
			else{
				echo "<ul class='main'>
								<li>
									<a href='../cliente/menuCliente.php' class='opt'> Clientes </a>
								</li>
								<li>
									<a href='../produto/menuProduto.php' class='opt2'> Produtos </a>
								</li>
								<li>
									<a href='../pedido/menuPedido.php' class='opt'> Pedidos </a>
								</li>
							</ul>";
			}
		?>
	</body>
</html>