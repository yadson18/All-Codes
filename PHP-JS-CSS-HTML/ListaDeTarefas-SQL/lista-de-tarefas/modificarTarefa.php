<div class="div">
	Tarefa a ser modificada
	<br><select name='tarefaParaModificar' class='slCodigo' required>
	<?php  
		session_start();
		require_once "../conexao.php";

		$colunas = "tf_nome, tf_codigo, tf_us_cod";
		$id = $_SESSION["id"];
		$condicao = "WHERE tf_us_cod=" . $id;

		$tarefas = select($colunas, "tarefas", $condicao);
		foreach($tarefas as $dados) {
			echo "<option value='" . $dados["tf_codigo"] . "'>" . $dados["tf_nome"] . "</option>";
		}
	?>
	</select><br>
	<button class='button drop'>Modificar</button><br>
	<form action="submitModificarTarefa.php" method="POST" style="display:none" class="formModificar">
		<input hidden name="id" class="id">
		Nome da tarefa <input type="text" name="nomeT" class="nome" required><br>
		Data <input type="date" name="data" class="data" required><br>
		Hora <input type="time" name="hora" class="hora" required><br>
		Situação <br><select name="status" class="slStatus" required>
					<option value="1">Concluída</option>
					<option value="0">Não Concluída</option>
				</select><br>
		<input hidden name="userId" class="userId">
		<input type="submit" value="Modificar" class="button"><br>
	</form>
	<br><a href="home.php" class="link">Retornar ao Menu</a>
	<div id="json">
	</div>
	<script src="../js/script.js"></script>
</div>
