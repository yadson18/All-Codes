<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Home</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, user-scalable=no"/>
		<link rel="stylesheet" type="text/css" href="css/estilo.css">
		<script src="js/jquery-3.1.1.js"></script>
	</head>
	<body>
		<form action="submit.php" method="POST">
			<table>
				<tr>
					<td>
						<p>Acesso à Classe</p>
					</td>
					<td>
						<input type="radio" name="acss" value="public" checked>
						public<br>
						<input type="radio" name="acss" value="private">
						abstract<br>
					</td>
				</tr>
				<tr>
					<td>
						<p>Nome da Classe</p>
					</td>
   			<td>
						<input type="text" name="className" placeholder="Veiculo" required class="text">
					</td>
				</tr>
				<tr>
					<td>
						<p>N° atributos</p>
					</td>
					<td>
						<select class="qtdAtributos">
							<?php 
								for($i = 1; $i < 40; $i++){
									 echo "<option value=" . $i . ">" . $i . "</option>";
								}
							?>
						</select>
						<a href="#" class="bttn">Done</a>
					</td>
				</tr>
			</table>
			<div class="botao">
				<input type="submit" value="Criar">
			</div>
		</form>
		<script type="text/javascript" src="js/script.js"></script>
	</body>
</html>
