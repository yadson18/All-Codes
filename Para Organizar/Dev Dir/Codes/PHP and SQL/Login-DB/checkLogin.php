<?php
	require_once "conexao.php";
	
	$condicao = " WHERE login='" . $_POST['login'] . "' AND senha='" . $_POST['senha'] . "'";
	$check = select("*", "login", $condicao);

//var_dump($check);
if(!mysqli_fetch_array($check)){
		header("Location: formLogin.php");
}
else{
		echo "<h1 style='text-align: center'>Logado.</h1>";
}
?>