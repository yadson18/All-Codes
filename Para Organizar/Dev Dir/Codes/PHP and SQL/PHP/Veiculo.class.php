<?php
	class Veiculo{
		private $marca;
		private $modelo;
		private $capacidadeDoTanque;
		private $kmPorLitro;

		public function __construct($marca, $modelo, $capacidadeDoTanque, $kmPorLitro){
			$this-> marca = $marca;
			$this-> modelo = $modelo;
			$this-> capacidadeDoTanque = $capacidadeDoTanque;
			$this-> kmPorLitro = $kmPorLitro;
		}

		public function autonomia(){
			return $this-> capacidadeDoTanque * $this-> kmPorLitro;
		}
	}
?>