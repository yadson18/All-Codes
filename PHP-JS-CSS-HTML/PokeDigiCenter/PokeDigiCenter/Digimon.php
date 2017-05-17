<?php  
	require_once "DigimonInterface.php";

	class Digimon extends Monster implements DigimonInterface{
		private $nome;

		public function __construct($nome, $apelido=null, $poderInicial=null){
			parent::__construct($apelido, $poderInicial);
			$this-> nome = $nome;
		} 

		function getName(){
			return $this-> nome;
		}
		function setName($nome){
			$this-> nome = $nome;
		}
	}
?>