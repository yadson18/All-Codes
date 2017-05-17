<?php  
	class Connection{
		private $connect;

		public function __construct($host, $port, $dbName, $user, $password){
			try {
				$this->connect = new PDO("mysql:host={$host};" . (strcmp($port, "") != 0 ? "port={$port};" : "") . "dbname={$dbName}", $user, $password);
			}
			catch (PDOException $e) {
				echo "Error.";
			}
		}

		public function select($collumns, $table, $condition = null, $conditionValues = null){
			$data;

			if((strcmp($condition, null) == 0) && (strcmp($conditionValues, null) == 0)){ 
				$sql = $this->connect->query("SELECT {$collumns} FROM {$table}");
				
				$data = $sql->fetchAll(PDO::FETCH_ASSOC);
			}
			else{
				$sql = $this->connect->prepare("SELECT {$collumns} FROM {$table} {$condition}");
				$sql->execute($conditionValues);
				
				$data = $sql->fetchAll(PDO::FETCH_ASSOC);
			}
			return $data;
		}

		public function insert($table, $collumns = [], $values){
			$collumnFormat = "";
			$collumn = "";

			for($i = 0; $i < sizeof($collumns); $i++){
				if($i < (sizeof($collumns) - 1)){
					$columnFormat .= ":" . $collumns[$i] . ", ";
					$column .= $collumns[$i] . ", ";
				}
				else{
					$columnFormat .= ":" . $collumns[$i];
					$column .= $collumns[$i];
				}
			}
			$sql = "INSERT INTO {$table}({$column}) VALUES({$columnFormat})";
			$stmt = $this->connect->prepare($sql);
			for($j = 0; $j < sizeof($collumns); $j++){
				$stmt->bindParam(":" . $collumns[$j], $values[$j], PDO::PARAM_STR);
			} 
			$stmt->execute();
		}
	}
?>

