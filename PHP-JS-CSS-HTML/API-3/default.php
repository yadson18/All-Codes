<?php 
	//require_once "class/Form.php"; 
	require_once "configs.php";
	require_once "class/Table.php";
	$content = buffer("mclasse.php");
?>
<!DOCTYPE html>
<html>
<head>
	<title>Default</title>
</head>
<body>
	<?= $content ?>
	<?php  
		$user = new Table("users");
		$user->setAttribute(
			"id" => ["integer", "not null", "auto_increment"],
			"nome" => ["varchar", "not null"]
		);
	?>
</body>
</html>