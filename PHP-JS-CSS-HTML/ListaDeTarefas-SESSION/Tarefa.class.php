<?php
	class Tarefa{
		private $nomeDaTarefa;
		private $data;
		private $hora;
		private $statusAtual;
		
		public function __construct($nomeDaTarefa, $data, $hora){
			$this-> nomeDaTarefa = $nomeDaTarefa;
			$this-> data = $data;
			$this-> hora = $hora;
			$this-> statusAtual = false;
		}
		
		public function getNomeTarefa(){
			return $this-> nomeDaTarefa;
		}
		public function getData(){
			return $this-> data;
		}
		public function getHora(){
			return $this-> hora;
		}
		public function getStatusAtual(){
			$status;
			if($this-> statusAtual == true){
				$status = "Tarefa concluída.";
			}
			else{
				$status = "Tarefa não concluída.";
			}
			
			return $status;
		}
		
		public function setNomeTarefa($nomeDaTarefa){
			$this-> nomeDaTarefa = $nomeDaTarefa;
		}
		public function setData($data){
			$this-> data = $data;
		}
		public function setHora($hora){
			$this-> hora = $hora;
		}
		public function setStatusAtual($statusAtual){
			$this-> statusAtual = $statusAtual;
		}
	}
?>