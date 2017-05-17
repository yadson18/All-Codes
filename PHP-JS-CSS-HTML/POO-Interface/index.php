<?php  
	require_once "Pessoa.php";

	$aluno = new Aluno("Yadson", "Algum Lugar", "27/03/1998", "20152infig0324", "2° período", 2);
	echo $aluno-> getMatricula();
	echo $aluno::getSemestre();

	$professor = new Professor("Ranieri", "Algum Lugar", "Não Sei", "123456");
	$t = new Turma("Informática para internet, 2° período");
	$professor-> addTurma($t);

	$tecnico = new Tecnico("Alguém", "Algum Lugar", "00/00/00", "000000", "Alguma função");
	$tecnico-> getFuncao();
?>