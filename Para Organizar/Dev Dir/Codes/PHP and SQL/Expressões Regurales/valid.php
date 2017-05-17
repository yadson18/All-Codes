<?php
	$valid = '/^y/i';
	if(preg_match($valid, $_POST["nome"])){
		echo "Isto é válido.";
	}
	else{
		$s = "<h1>Inválido</h1>";
		header("Location:index.php?scr=$s");
	}
?>