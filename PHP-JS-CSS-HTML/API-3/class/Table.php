<?php  
	class Table{
		protected $name;
		protected $attributes;

		public function __construct($name){
			$this->name = $name;
			$this->attributes = array();
		}

		public function setAttribute($attributes){
			foreach ($this->attributes as $attribute) {
				array_push($this->attributes, $attribute);
			}
		}
		public function getAttribute(){
			return $this->attributes;
		}

		public function setName($name){
			$this->name = $name;
		}
		public function getName(){
			return $this->name;
		}

		public function findType($array){
			$type;

			$types = [
				"VARCHAR", "INT", "INTEGER", "BOOLEAN", "DATE", "DATETIME", "BLOB", "MEDIUM", "TIME", "CHAR", "TEXT", "DECIMAL"
			];

			for($i = 0; $i < sizeof($types);){
				if(strcasecmp($array[0], $types[$i])){
					$type = $types[$i];
					break;
				}
				else{
					$i++;
				}
			}

			return $type;
		}

		public function getNameAndType(){
			$nameAndType = array();

			foreach ($this->attributes as $name => $attribute) {
				array_push($nameAndType, $name=>$this->findType($attribute));
			}

			return $nameAndType;
		}
	}
?>