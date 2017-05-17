<?php  
	class Tecnico extends Servidor implements TecnicoInterface{
		$funcao;
		$ferias;

		public function __construct($nome, $endereco, $dataDeNascimento, $siape, $funcao){
			parent::__construct($nome, $endereco, $dataDeNascimento, $siape);
			$this-> funcao = $funcao;
		}

		public function getFuncao(){
			return $this-> funcao;
		}

    	public function addFerias($start, $end){
    		$this-> ferias = $start . " / " . $end;
    	}
	}
?>