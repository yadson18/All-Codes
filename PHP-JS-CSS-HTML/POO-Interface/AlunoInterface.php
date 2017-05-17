<?php  
	interface AlunoInterface{
		public function __construct($nome, $endereco, $dataDeNascimento, $matricula, $turma, $semestre);

    	public function getMatricula();
    	public function getTurma();
		public static function getSemestre();
  	}
?>