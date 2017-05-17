<?php  
	class SqlPDO{
		private $conexao;

		public function __construct($host, $port, $dbName, $user, $password){
			try {
				// if(strcmp($port, "") == 0){
				// 	$this->conexao = new PDO("mysql:host={$host};dbname={$dbName}", $user, $password);
				// }
				// else{
				// 	$this->conexao = new PDO("mysql:host={$host};port={$port};dbname={$dbName}", $user, $password);
				// }
				$this->conexao = new PDO("mysql:host={$host};" . (strcmp($port, "") != 0 ? "port={$port};" : "") . "dbname={$dbName}", $user, $password);
				$this->conexao->query("CREATE TABLE IF NOT EXISTS user(
											user_id integer(10) not null auto_increment primary key,
											user_login varchar(100) not null,
											user_password varchar(255) not null,
											user_name varchar(60) not null,
											user_email varchar(50) not null,
											user_phone varchar(15) not null
									   )");
			}
			catch (PDOException $e) {
				echo "Error.";
			}
		}

		public function select($colunas, $tabela, $condicao = null, $condicaoValues = null){
			$dados;

			if((strcmp($condicao, null) == 0) && (strcmp($condicaoValues, null) == 0)){ 
				$sql = $this->conexao->query("SELECT {$colunas} FROM {$tabela}");
				
				$dados = $sql->fetchAll(PDO::FETCH_ASSOC);
			}
			else{
				$sql = $this->conexao->prepare("SELECT {$colunas} FROM {$tabela} {$condicao}");
				$sql->execute($condicaoValues);
				
				$dados = $sql->fetchAll(PDO::FETCH_ASSOC);
			}
			return $dados;
		}

		public function insert($tabela, $colunas, $valores){
			$intrr = sizeof($valores);
			$intrrVal = "";
			for($i = 0; $i < $intrr; $i++){
				if($i < ($intrr - 1)){
					$intrrVal .=  "?,";
				}
				else{
					$intrrVal .=  "?";
				}
			}

			$this->conexao->prepare("INSERT INTO {$tabela}({$colunas}) VALUES({$intrrVal})");
			
			$number = 1;
			foreach ($valores as $valor) {
				$this->bindParam(1, $valor);
				$number++;
			}
		}
	}
?>

