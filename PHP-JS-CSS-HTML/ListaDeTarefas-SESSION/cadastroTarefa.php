<form action="cadastroForm.php" method="POST">
	Nome da tarefa <input type="text" name="nomeT"><br>
	Data <br><select name="dia">
			<?php 
				for($i = 1; $i < 32; $i++){
					$day = $i;
					if($i < 10){
						$day = "0" . $i;
					}
					echo "<option value='" . $day . "'>" . $day ."</option>";
				}
			?>
		</select>/
		<select name="mes">
			<?php 
				$meses = [1 => "Janeiro", 2 => "Fevereiro", 3 => "Março", 4 => "Abril", 5 => "Maio", 6 => "Junho", 7 => "Julho", 8 => "Agosto", 9 => "Setembro", 10 => "Outubro", 11 => "Novembro", 12 => "Dezembro"];
				for($i = 1; $i < 13; $i++){
					echo "<option value='" . $meses[$i] . "'>" . $meses[$i] ."</option>";
				}
			?>
		</select>/
		<select name="ano">
			<?php 
				for($i = 2016; $i < 2040; $i++){
					echo "<option value='" . $i . "'>" . $i ."</option>";
				}
			?>
		</select><br>

	Hora <br><select name="hora">
				<?php  
					for($i = 0; $i < 24; $i++){
						$hora = $i;
						if($i < 10){
							$hora = "0" . $i;
						}
						echo "<option value='" . $hora . "'>" . $hora . "</option>";
					}
				?>
			</select>:
			<select name="minuto">
				<?php  
					for($i = 0; $i < 60; $i++){
						$minuto = $i;
						if($i < 10){
							$minuto = "0" . $i;
						}
						echo "<option value='" . $minuto . "'>" . $minuto . "</option>";
					}
				?>
			</select><br>
	<input type="submit" value="Cadastrar" class="button"><br>
	<a href="index.php">Retornar ao Menu</a>
</form>
