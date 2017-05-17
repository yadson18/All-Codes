<?php  
	class SqlPDO{
		private $conexao;

		public function __construct($host, $port, $dbName, $user, $password){
			try {
				$this->conexao = new PDO("mysql:host={$host};" . (strcmp($port, "") != 0 ? "port={$port};" : "") . "dbname={$dbName}", $user, $password);
				$this->conexao->query("CREATE TABLE IF NOT EXISTS users(
																	 			usr_id integer not null auto_increment primary key,
																				usr_login varchar(100) not null,
																				usr_password varchar(255) not null,
																				usr_name varchar(60) not null,
																				usr_age integer(3) not null
									   								 );
																		 CREATE TABLE IF NOT EXISTS statistics(
																				stc_id integer not null auto_increment primary key,
																				stc_victory integer not null,
																				stc_defeat integer not null,
																				stc_score integer not null,
																				stc_usr_id integer not null,
																				constraint stc_usr_fk foreign key(stc_usr_id) references users(usr_id)
																		 );
																		 CREATE TABLE IF NOT EXISTS wordsAndTips(
																				wat_id integer not null auto_increment primary key,
																				wat_tip varchar(100) not null,
																				wat_word varchar(50) not null
																		 );");
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
		
		public function update($table, $columnsAndValues, $condicion = null){
			$loopCount = 0;
			$prepareData = "";
			
			foreach($columnsAndValues as $column => $value){
				$loopCount++;
				if($loopCount == sizeof($columnsAndValues)){
					$prepareData .= "{$column} = :{$column}";
				}
				else{
					$prepareData .= "{$column} = :{$column},";
				}
			}
			
			$sql = "UPDATE {$table}
								SET {$prepareData}
            WHERE filmID = :filmID";
$stmt = $pdo->prepare($sql);                                  
$stmt->bindParam(':filmName', $_POST['filmName'], PDO::PARAM_STR);    
			
			
		}
	}
?>