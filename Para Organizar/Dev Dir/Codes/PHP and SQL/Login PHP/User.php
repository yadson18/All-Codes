<?php
	class User{
		private $login;
		private $pass;
		
		public function __construct($login, $pass){
			$this-> login = $login;
			$this-> pass = $pass;
		}
		
		public function getLogin(){
			return $this-> login;
		}
		public function getPass(){
			return $this-> pass;
		}
		
		public function setLogin($login){
			$this-> login = $login;
		}
		public function setPass($pass){
			$this-> pass = $pass;
		}
	}
?>