<?php  
	require_once "PokemonInterface.php";

	class Pokemon extends Monster implements PokemonInterface{
		private $especie;
		private $tipo;

		public function __construct($especie,  $tipo, $apelido=null, $poderInicial=null){
			parent::__construct($apelido, $poderInicial);
			$this-> especie = $especie;
			$this-> tipo = $tipo;
		}

		public function getEspecie(){
			return $this-> especie;
		}
		public function getTipo(){
			return $this-> tipo;
		}

		public function setEspecie($especie){
			$this-> especie = $especie;
		}
		public function setTipo($tipo){
			$this-> tipo = $tipo;
		}
	}
?>