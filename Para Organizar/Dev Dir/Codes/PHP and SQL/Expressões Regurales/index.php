<html>
	<head>
		<title>Home</title>
		<script src="jquery-3.1.1.js"></script>
	</head>
	<body>
		<div id='cont'>
			<form action='valid.php' method='POST'>
				Nome: <input type='text' name='nome'><br>
				<input type='submit'>
			</form>
		</div>
		<?php
					if(isset($_GET["scr"])){
						echo "<script>$('#cont').append(" . $_GET["scr"] . "); </script>";
					}
		?>
	</body>
</html>