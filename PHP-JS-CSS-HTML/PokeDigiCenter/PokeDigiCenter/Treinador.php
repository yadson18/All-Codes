<?php  
	require_once "PokeTrainer.php";
	require_once "DigiTrainer.php";
	require_once "Monster.php";

	abstract class Treinador{
		private $nome;
		private $sobrenome;
		private $idade;
		private $monstros;

		public function __construct($nome, $sobrenome, $idade){
			$this-> nome = $nome;
			$this-> sobrenome = $sobrenome;
			$this-> idade = $idade;
			$this-> monstros = array();
		}

		public function getNome(){
			return $this-> nome;
		}
		public function getSobrenome(){
			return $this-> sobrenome;
		}
		public function getIdade(){
			return $this-> idade;
		}
		public function getMonsters(){
			return $this-> monstros;
		}

		public function setNome($nome){
			$this-> nome = $nome;
		}
		public function setSobrenome($sobrenome){
			$this-> sobrenome = $sobrenome;
		}
		public function setIdade($idade){
			$this-> idade = $idade;
		}
		public function _addMonster($monster){
			array_push($this-> monstros, $monster);
		}

		public function ordenarArray(){
			$monstro;
        
        	for($i = 0; $i < sizeof($this-> monstros); $i++){
            	for($j = 0; $j < (sizeof($this-> monstros) - 1); $j++){
                	if($this-> monstros[$j]-> poderTotal() < $this-> monstros[$j + 1]-> poderTotal()){
                    	$monstro = $this-> monstros[$j + 1];
                    	$this-> monstros[$j + 1] = $this-> monstros[$j];
                    	$this-> monstros[$j] = $monstro;
                	}
            	}
        	}
		}

		public function toString(){
			$trainerDados = "";
			$trainerDados = "<br>Nome e sobrenome: " . $this->getNome() . " " . $this->getSobrenome() . "<br> Idade: " . $this->getIdade(). "<br>";

			for($i = 0; $i < sizeof($this-> monstros); $i++){
				$trainerDados .= $this-> monstros[$i]-> toString();
			}
			return $trainerDados;
		}
		
		public function duelar(TrainerInterface $treinador){
			$sizeArray1 = sizeof($this-> monstros);
			if($sizeArray1 > 1){
				$this-> ordenarArray();
			}
			$sizeArray2 = sizeof($treinador-> monstros);
			if($sizeArray2 > 1){
				$treinador-> ordenarArray();
			}	
			$length;

			if($sizeArray1 > $sizeArray2){
				$length = $sizeArray2;
			}
			else{
				$length = $sizeArray1;
			}

			$vitoriaTreinador1 = 0;
			$vitoriaTreinador2 = 0;
			for($i = 0; $i < $length; $i++){
				if($this-> monstros[$i]-> duelar($treinador-> monstros[$i]) == 1){
					echo "_______________________________<br>Vencedor da batalha " . ($i + 1) . ":<br>" . $this-> monstros[$i]-> toString();
					$vitoriaTreinador1++;
				}
				else{
					echo "_______________________________<br>Vencedor da batalha " . ($i + 1) . ":<br>" . $treinador-> monstros[$i]-> toString();
					$vitoriaTreinador2++;
				}
			}
			if($vitoriaTreinador1 > $vitoriaTreinador2){
				echo "_______________________________<br>O vencedor da batalha é: <br>" . $this-> toString() . "";
			}
			else if($vitoriaTreinador2 > $vitoriaTreinador1){
				echo "_______________________________<br>O vencedor da batalha é: <br>" . $treinador-> toString() . "";
			}
			else{
				echo "_______________________________<br>Ocorreu um empate: <br>_______________________________<br>";
			}
		}
	}
?>