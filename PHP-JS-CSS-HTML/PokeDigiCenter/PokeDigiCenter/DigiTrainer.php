<?php 
	require_once "DigiTrainerInterface.php";

	class DigiTrainer extends Treinador implements DigiTrainerInterface{
		public function __construct($nome, $sobrenome, $idade){
			parent::__construct($nome, $sobrenome, $idade);
		}

		public function addMonster(DigimonInterface $monster){
			$this-> _addMonster($monster);
		}
	}
?>