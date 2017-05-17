<?php  
	require_once "Tecnico.php";
	require_once "Professor.php";

	class Servidor extends Pessoa implements ServidorInterface{
		$siape;

		public function __construct($nome, $endereco, $dataDeNascimento, $siape){
			parent::__construct($nome, $endereco, $dataDeNascimento);
			$this-> siape = $siape;
		}

		public function getSiape(){
			return $this-> siape;
		}
	}
?>