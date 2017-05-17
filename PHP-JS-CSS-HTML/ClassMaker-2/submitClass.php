<!DOCTYPE html>
<html>
	<head>
		 <title>Class Maker</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width">
		<link rel="stylesheet" type="text/css" href="css/estilo.css">
	</head>
	<body style="background-color: #272822; color: white; width: 600px; font-family: monospace; font-size: 16px">
		<?php
			$classe = "<span class='red'>" . $_POST['classAcss'] . " class</span> <span class='green'>" . $_POST['className'] . "</span> {";
			for($i = 0; $i < $_POST['qtdAtributos']; $i++){
				 $classe .= " <br> &nbsp;&nbsp;&nbsp; <span class='red'>" . $_POST['attr' . ($i+1)] . "</span> <span class='blue'>" . $_POST['type' . ($i+1)] . "</span> <span>" . $_POST['nome' . ($i+1)] . "</span>;";
			}
			$classe .= "<br>";
			for($j = 0; $j < $_POST['qtdAtributos']; $j++){
				if(strcmp($_POST['attr' . ($j+1)], "private") == 0){
					$methodName = ucfirst($_POST['nome' . ($j+1)]);
					$classe .= " <br> &nbsp;&nbsp;&nbsp; <span class='red'>public</span> <span class='blue'>" . $_POST['type' . ($j+1)] . "</span> <span class='green'>get" . $methodName . "</span>(){ <br> &nbsp;&nbsp;&nbsp; }";
					$classe .= " <br> &nbsp;&nbsp;&nbsp; <span class='red'>public</span> <span class='blue'>void</span> <span class='green'>set" . $methodName . "</span>(<span class='blue'>" . $_POST['type' . ($j+1)] . "</span> <span class='orange'>" . $_POST['nome' . ($j+1)]. "</span>){ <br> &nbsp;&nbsp;&nbsp; }";
				}
			}
			$classe .= " <br>}";
			
			echo $classe;
		?>
	</body>
</html>