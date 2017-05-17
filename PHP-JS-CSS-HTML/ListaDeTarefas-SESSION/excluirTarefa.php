<?php  
	require "Tarefa.class.php";
	session_start();
?>
<form action="submitDeletar.php" method="POST">
	Selecione a tarefa a ser excluída.
	<br><select name="tarefaParaDeletar">
		<?php  
			for($i = 0; $i < sizeof($_SESSION["tarefas"]);){
				if($_SESSION["tarefas"][$i] !== NULL){
					echo "<option value='" . $i . "'>" . $_SESSION["tarefas"][$i]-> getNomeTarefa() . "</option>"; 
					$i++;
				}
				else{
					$i++;
				}
			}
		?>
	</select><br>
	<input type="submit" value="Deletar" class="button"><br>
	<div style='text-align:center'><a href='index.php' class='link'>Retornar ao menu</a></div>
</form>
