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
				$this->conexao->query("CREATE TABLE IF NOT EXISTS users(
											user_id integer(10) not null auto_increment primary key,
											user_login varchar(100) not null,
											user_password varchar(255) not null,
											user_name varchar(60) not null,
											user_email varchar(50) not null,
											user_phone varchar(15) not null, 
											user_age integer(3) not null
									   )");
				//$this->conexao->query("CREATE TABLE IF NOT EXISTS ");
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
			$columnFormat = "";
			$column = "";
			
			for($i = 0; $i < sizeof($colunas); $i++){
				if($i < (sizeof($colunas) - 1)){
					$columnFormat .= ":" . $colunas[$i] . ", ";
					$column .= $colunas[$i] . ", ";
				}
				else{
					$columnFormat .= ":" . $colunas[$i];
					$column .= $colunas[$i];
				}
			}
			$sql = "INSERT INTO {$tabela}({$column}) VALUES({$columnFormat})";
			$stmt = $this->conexao->prepare($sql);
			for($j = 0; $j < sizeof($colunas); $j++){
				$stmt->bindParam(":" . $colunas[$j], $valores[$j], PDO::PARAM_STR);
			} 
			$stmt->execute();
		}
	}
?>

