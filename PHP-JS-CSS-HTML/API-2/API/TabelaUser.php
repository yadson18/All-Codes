<?php 
	require_once "PDO.php";

	class TabelaUser{
		protected $baseDeDados; 
		protected $nomeDaTabela;
		protected $atributos;

		public function __construct($baseDeDados, $nomeDaTabela){
			$this->baseDeDados = $baseDeDados;
			$this->nomeDaTabela = $nomeDaTabela;
			$this->atributos = array();
			array_push($this->atributos, "user_id integer(10) not null primary key auto_increment,");
			array_push($this->atributos, "user_login varchar(40) not null,");
			array_push($this->atributos, "user_password varchar(32) not null");
		}

		public function setAtributos($atributos = null){
			if($atributos != null){
				$this->atributos[2] .= ","; 

				for($i = 0; $i < sizeof($atributos); $i++) {
					if(($i + 1) == sizeof($atributos)){
						array_push($this->atributos, $atributos[$i]);
					}
					else{
						array_push($this->atributos, $atributos[$i] . ",");
					}
				}	
			}
		}

		public function createTable($host, $user, $pass){
			try {
				$PDO = new PDO("mysql:host=" . $host . ";port=13306;dbname=" . $this->baseDeDados, $user, $pass);

				$attrValues = "";
				foreach ($this->atributos as $attr){
					$attrValues .= $attr . " ";
				}

				$PDO->query("CREATE TABLE " . $this->nomeDaTabela . "( " . $attrValues . ");");
			}
			catch (PDOException $e) {
	    		echo "Error.";
			}
		}
	}
?>