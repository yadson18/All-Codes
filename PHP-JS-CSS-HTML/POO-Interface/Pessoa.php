<?php  
	require_once "Aluno.php";
	require_once "Servidor.php";

	class Pessoa{
		$nome; 
		$endereco;
		$dataDeNascimento;

		public function __construct($nome, $endereco, $dataDeNascimento){
			$this-> nome = $nome;
			$this-> endereco = $endereco;
			$this-> dataDeNascimento = $dataDeNascimento;
		}
	}
?>
