<?php
	class Connect{
		private $link;
	
		public function __construct($server, $user, $pass, $dataBase){
			$this-> link = mysqli_connect($server, $user, $pass, $dataBase);
		}
		
		public function getLink(){
			return $this-> link;
		}
		
		public function insert($tabela, $dados){
			foreach($dados as $item){
				$data = 
			}
			mysqli_query($this-> getLink(), "INSERT INTO " . $dados . "(" . $colunas . ") VALUES(" . $dados . ")");
		}
	}
?>
