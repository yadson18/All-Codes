<?php
	$json = [
		"totalVictory" => $_POST["victory"]
	];
	
	echo json_encode($json);
?>