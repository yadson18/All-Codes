<?php
	class Pessoa{
		private $nome;
		private $idade;
		
		public function __construct($nome, $idade){
			$this-> nome = $nome;
			$this-> idade = $idade;
		}
		
		public static function getNome(){
			echo self::$nome;
		}
	}
?>