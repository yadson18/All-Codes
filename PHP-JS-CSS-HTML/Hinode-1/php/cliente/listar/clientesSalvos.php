<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Clientes Cadastrados</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="utf-8"/>
		<link rel="stylesheet" type="text/css" href="../../../css/estilo.css"/>
	</head>
	<body>
		<?php 
			require_once "../../../menu/menu2.php"; 
			require_once "../../PDO.php";
			session_start();
			menu("../menuCliente.php", "Retornar");
			
			$tabelas = "cliente, user";
			$colunas = "cl_nome, cl_sobrenome, cl_idade, cl_email, cl_telefone";
			$condicao = " WHERE cl_us_codigo=" . $_SESSION['uid'] . " AND cl_us_codigo = us_codigo;";
			$clientes = select($colunas, $tabelas, $condicao);
			$number = 1;
			echo "<table>
								<tr>
									<td>Número</td>
									<td>Cliente</td>
									<td>Idade</td>
									<td>Email</td>
									<td>Telefone</td>
								</tr>";
			while($dados = $clientes->fetch(PDO::FETCH_ASSOC)){
				echo "<tr>
									<td>" . $number . "</td>
									<td>" . $dados['cl_nome'] . " " . $dados['cl_sobrenome'] . "</td>
									<td>" . $dados['cl_idade'] . "</td>
									<td>" . $dados['cl_email'] . "</td>
									<td>" . $dados['cl_telefone'] . "</td>
								</tr>";
				$number++;
			}
			echo "</table>";
		?>
	</body>
</html>