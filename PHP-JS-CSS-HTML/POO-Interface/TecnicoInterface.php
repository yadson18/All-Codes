<?php  
	interface Tecnico{
		public __construct($nome, $endereco, $dataDeNascimento, $siape, $funcao);

    	public function getFuncao();
    	public function addFerias($start, $end);
  	}
?>