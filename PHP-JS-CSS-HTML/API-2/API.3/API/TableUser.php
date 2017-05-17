<?php 
	class TableUser{
		private $baseDeDados; 
		private $nomeDaTabela;
		private $atributos;

		public function __construct(){
			$this->atributos = array();
			array_push($this->atributos, "user_id integer(10) not null primary key auto_increment,");
			array_push($this->atributos, "user_login varchar(40) not null,");
			array_push($this->atributos, "user_password varchar(32) not null");
		}

		public function getBaseDeDados(){
			return $this->baseDeDados;
		}

		public function getNomeDaTabela(){
			return $this->nomeDaTabela;
		}

		public function getAtributos($i){
			return $this->atributos[$i];
		}
		public function length(){
			return sizeof($this->atributos);
		}

		public function defineTable($nomeDaTabela, $atributos = null){
			$this->nomeDaTabela = $nomeDaTabela;
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

		public function createTable($host, $baseDeDados, $user, $pass){
			$this->baseDeDados = $baseDeDados;
			try {
				$PDO = new PDO("mysql:host=" . $host . ";port=13306;dbname=" . $this->baseDeDados, $user, $pass);

				$attrValues = "";
				foreach ($this->atributos as $attr){
					$attrValues .= $attr . " ";
				}

				$PDO->query("CREATE TABLE IF NOT EXISTS " . $this->nomeDaTabela . "( " . $attrValues . ");");
			}
			catch (PDOException $e) {
	    		echo "Error.";
			}
		}
	}
?>