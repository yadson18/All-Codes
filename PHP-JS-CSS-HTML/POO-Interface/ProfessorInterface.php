<?php  
	interface Professor{
		public function __construct($nome, $endereco, $dataDeNascimento, $siape);

    	public function getTurma();
    	public function addTurma(Turma $t);
    	public function addProjeto(Projeto $p);
  	}
?>