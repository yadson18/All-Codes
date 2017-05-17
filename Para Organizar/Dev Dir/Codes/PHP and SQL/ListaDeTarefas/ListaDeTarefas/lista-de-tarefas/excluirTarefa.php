<form action="submitExcluir.php" method="POST">
	Selecione a tarefa a ser excluída.
	<br><select name="tarefaParaDeletar" required>
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
	<input type="submit" value="Deletar" class="button"><br>
	<div style='text-align:center'><a href='home.php' class='link'>Retornar ao menu</a></div>
</form>
