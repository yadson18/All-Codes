<?php  
	interface ServidorInterface{
		public function __construct($nome, $endereco, $dataDeNascimento, $siape);

		public function getSiape();
	}
?>