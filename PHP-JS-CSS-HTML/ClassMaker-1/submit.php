<!DOCTYPE html>
<html>
<head>
	<title>Class</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css/estilo.css">
</head>
<body>
	<?php
		$methods = "";
		$space = "&nbsp&nbsp&nbsp";
		echo "<span class='red'>" . $_POST['acss'] . " class " . "</span><span class='green'>" . $_POST['className'] . "</span>{<br>";
		for($i = 0; $i < ((sizeof($_POST) - 2)/3); $i++){
			echo $space . "<span class='red'>" . $_POST["attrAcss" . ($i+1)] . "</span>&nbsp<span class='blue'>" .	 $_POST["type" . ($i + 1)] . "</span>&nbsp" . $_POST["attr" . ($i + 1)] . ";<br>";
			if($_POST["attrAcss" . ($i+1)] == "private"){
					$methods .= $space . "<span class='red'>public</span> <span class='blue'>" . $_POST['type' . ($i+1)] . "</span> <span class='green'>get" . ucfirst($_POST['attr' . ($i+1)]) . "</span>(){<br>" . $space . "}<br>";
					$methods .= $space . "<span class='red'>public void</span> <span class='green'>set" . ucfirst($_POST['attr' . ($i+1)]) . "</span>(<span class='orange'>" . $_POST['type' . ($i+1)] . " " . $_POST['attr' . ($i+1)] . "</span>){<br>" . $space . "}<br><br>";
			}
		}
		echo "<br>" . $space . "<span class='green'>" . $_POST['className'] . "</span>(){<br>
			  &nbsp&nbsp&nbsp}
			  <br><br>
				 $methods
			  }<br><br>";	
	?>
</body>
</html>

