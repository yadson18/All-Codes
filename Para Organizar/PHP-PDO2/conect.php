<?php
	$PDO = new PDO("mysql:host=localhost; dbname=test", $_POST['user'], $_POST['pass']);
	
	//if($PDO){
	//	echo "<script>alert('Conectado.');</script>";
	//}
	//else{
	//	echo "<script>alert('Desconectado.');</script>";
	//}
	var_dump($PDO-> MYSQL_HOST);
?>