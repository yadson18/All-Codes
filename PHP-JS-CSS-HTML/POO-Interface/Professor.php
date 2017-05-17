<?php  
	class Professor extends Servidor implements ProfessorInterface{
		$turma;
		$projeto;

		public function __construct($nome, $endereco, $dataDeNascimento, $siape){
			parent::__construct($nome, $endereco, $dataDeNascimento, $siape);
			$this-> turma = array();
			$this-> projeto = array();
		}

		public function getTurma(){
			return $this-> turma;
		}

    	public function addTurma(Turma $t){
    		array_push($this-> turma, $t);
    	}
    	public function addProjeto(Projeto $p){
    		array_push($this-> projeto, $p);
    	}
	}
?>