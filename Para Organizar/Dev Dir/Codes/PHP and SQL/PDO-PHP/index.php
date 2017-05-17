<?php
	require_once "db.php";
	
	$attr = "cod integer(3) not null auto_increment primary key, nome varchar(40) not null";
	create("admins", $attr);
?>