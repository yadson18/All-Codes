<?php  
	class Aluno extends Pessoa implements AlunoInterface{
		$matricula;
		$turma;
		$semestre;

		public function __construct($nome, $endereco, $dataDeNascimento, $matricula, $turma, $semestre){
			parent::__construct($nome, $endereco, $dataDeNascimento);
			$this-> matricula = $matricula;
			$this-> turma = $turma;
			$this-> semestre = $semestre;
		}

		public function getMatricula(){
			return $this-> matricula;
		}

    	public function getTurma(){
    		return $this-> turma;
    	}

    	public static function getSemestre(){
    		return $this-> semestre;
    	}
	}
?>