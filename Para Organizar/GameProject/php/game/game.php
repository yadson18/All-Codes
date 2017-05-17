<!DOCTYPE html>
<html>
<head>
	<title>Jogo da forca</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="/GameProject/css/gameStyle.css">
	<script src="/GameProject/js/jquery-3.1.1.js"></script>
</head>
<body>
	<div id="gallows">
		<img src="/GameProject/img/forca.png">
		<div id="doll">
			<div id="head" class="hideBody"></div>
			<div id="leftHand" class="hideBody"></div>
			<div id="rightHand" class="hideBody"></div>
			<div id="body" class="hideBody"></div>
			<div id="leftFoot" class="hideBody"></div>
			<div id="rightFoot" class="hideBody"></div>
		</div>
		<div>
			Pontos: <span id="totalScore">0</span>
		</div>
	</div>
	<h2 id="tip"></h2>
	<h1 id="word"></h1>
	<div id="buttons">
	<?php
		session_start();
		require_once "../functions.php";
		
		printKeyboard(8, 3);
	?>
	</div>
	<script src="/GameProject/js/scripts.js"></script>
</body>
</html>	

