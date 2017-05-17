<?php  
	require_once "PokeTrainerInterface.php";

	class PokeTrainer extends Treinador implements PokeTrainerInterface{
		public function __construct($nome, $sobrenome, $idade){
			parent::__construct($nome, $sobrenome, $idade);
		}

		public function addMonster(PokemonInterface $monster){
			$this-> _addMonster($monster);
		}
	}
?>