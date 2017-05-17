<?php
	require "Veiculo.class.php";
	
	$v = new Veiculo($_POST["marca"], $_POST["modelo"], $_POST["capTanque"], $_POST["kmPorLitro"]);

	var_dump($v);

	echo "<br><span>Autonomia: " . $v-> autonomia() . "</span>";
?>