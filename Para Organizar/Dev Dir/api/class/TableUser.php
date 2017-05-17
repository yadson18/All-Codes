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
			$type = in_array($value, $array);
			//terminar o find 
		}

		public function getNameAndType(){
			$nameAndType = array();

			foreach ($this->attributes as $name => $attribute) {
				foreach ($attribute as $attr) {
					array_push($nameAndType, $name=>)
				}
			}
		}
	}
?>