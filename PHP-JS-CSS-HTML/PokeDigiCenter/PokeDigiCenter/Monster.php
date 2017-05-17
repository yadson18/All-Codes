<?php  
	require_once "Pokemon.php";
	require_once "Digimon.php";

	abstract class Monster{
		private $apelido;
		private $poderInicial;
		private $experienciaAtual;
		private $levelAtual;

		public function __construct($apelido, $poderInicial){
			$this-> apelido = $apelido;
			$power = (int) $poderInicial;
			if($power < 5){
				$this-> poderInicial = 5;
			}
			else if($power > 20){
				$this-> poderInicial = 200;
			}
			else{
				$this-> poderInicial = $power;
			}
			$this-> experienciaAtual = 0;
			$this-> levelAtual = 1;
		}

		public function poderTotal(){
			return round((($this-> poderInicial) + ($this-> poderInicial) * ($this-> levelAtual) * ($this-> levelAtual) / 5));
		}
		
		public function setApelido($apelido){
			$this-> apelido = $apelido;
		}
		public function setPoderInicial($poderInicial){
			$this-> poderInicial = $poderInicial;
		}
		public function setXp($xp){
			$this-> experienciaAtual += $xp;
		}
		public function setLevel($level){
			$this-> levelAtual = $level;
		}
		

		public function getApelido(){
			return $this-> apelido;
		}
		public function getXp(){
			return $this-> experienciaAtual;
		}
		public function getLevel(){
			if($this-> experienciaAtual > 4){
				$this-> setLevel($this-> experienciaAtual / 5);
			}
			return round($this-> levelAtual);
		}

		public function toString(){
			$monsterDados;

			if($this instanceof Pokemon){
				$monsterDados = "<br>Espécie: " . $this->getEspecie() . "<br> Tipo: " . $this->getTipo() . "<br> Apelido: " . $this->getApelido() . "<br> Poder Total: " . $this->poderTotal() . "<br> Level Atual: " . $this->getLevel() . "<br>";
			}
			else{
				$monsterDados = "<br>Nome: ". $this->getName() . "<br> Apelido: " . $this->getApelido() . "<br> Poder Total: " . $this->poderTotal() . "<br> Level Atual: " . $this->getLevel() . "<br>";
			}
			return $monsterDados;
		}

		public function duelar($monster){
			$power1;
			$xpWinner1;
			$power2;
			$xpLoser1;
			$vencedor;
			if($this instanceof Pokemon && $monster instanceof Pokemon){
				if(
				   $this-> getTipo() == "fogo" && $monster-> getTipo() == "planta" || 
				   $this-> getTipo() == "planta" && $monster-> getTipo() == "água" ||
				   $this-> getTipo() == "água" && $monster-> getTipo() == "fogo" ||
				   $this-> getTipo() == "psíquico" && $monster-> getTipo() == "trevas" ||
				   $this-> getTipo() == "trevas" && $monster-> getTipo() == "luta" ||
				   $this-> getTipo() == "luta" && $monster-> getTipo() == "psíquico"
				){
					$power1 = $this-> poderTotal() * 1.5;
					$power2 = $monster-> poderTotal() * 0.5;
					if($power1 > $power2){
						$xpWinner1 = $monster-> getLevel() * 2;
						$this-> setXp($xpWinner1);
						$xpLoser1 = $monster-> getLevel() / 2;
						$monster-> setXp($xpLoser1);
						$vencedor = 1;
					}
					else{
						$xpWinner1 = $this-> getLevel() * 2;
						$monster-> setXp($xpWinner1);
						$xpLoser1 = $this-> getLevel() / 2;
						$this-> setXp($xpLoser1);
						$vencedor = 0;
					}
				}
				else if(
				   $monster-> getTipo() == "fogo" && $this-> getTipo() == "planta" || 
				   $monster-> getTipo() == "planta" && $this-> getTipo() == "água" ||
				   $monster-> getTipo() == "água" && $this-> getTipo() == "fogo" ||
				   $monster-> getTipo() == "psíquico" && $this-> getTipo() == "trevas" ||
				   $monster-> getTipo() == "trevas" && $this-> getTipo() == "luta" ||
				   $monster-> getTipo() == "luta" && $this-> getTipo() == "psíquico"
				){
					$power1 = $monster-> poderTotal() * 1.5;
					$power2 = $this-> poderTotal() * 0.5;
					if($power1 > $power2){
						$xpWinner1 = $this-> getLevel() * 2;
						$monster-> setXp($xpWinner1);
						$xpLoser1 = $this-> getLevel() / 2;
						$this-> setXp($xpLoser1);
						$vencedor = 0;
					}
					else{
						$xpWinner1 = $monster-> getLevel() * 2;
						$this-> setXp($xpWinner1);
						$xpLoser1 = $monster-> getLevel() / 2;
						$monster-> setXp($xpLoser1);
						$vencedor = 1;
					}
				}
				else{
					$power1 = $this-> poderTotal();
					$power2 = $monster-> poderTotal();
					if($power1 > $power2){
						$xpWinner1 = $monster-> getLevel() * 2;
						$this-> setXp($xpWinner1);
						$xpLoser1 = $monster-> getLevel() / 2;
						$monster-> setXp($xpLoser1);
						$vencedor = 1;
					}
					else{
						$xpWinner1 = $this-> getLevel() * 2;
						$monster-> setXp($xpWinner1);
						$xpLoser1 = $this-> getLevel() / 2;
						$this-> setXp($xpLoser1);
						$vencedor = 0;
					}
				}
			}
			else{
				$power1 = $this-> poderTotal();
				$power2 = $monster-> poderTotal();

				if($power1 > $power2){
					$xpWinner1 = $monster-> getLevel() * 2;
					$this-> setXp($xpWinner1);
					$xpLoser1 = $monster-> getLevel() / 2;
					$monster-> setXp($xpLoser1);
					$vencedor = 1;
				}
				else{
					$xpWinner1 = $this-> getLevel() * 2;
					$monster-> setXp($xpWinner1);
					$xpLoser1 = $this-> getLevel() / 2;
					$this-> setXp($xpLoser1);
					$vencedor = 0;
				}
			}
			return $vencedor;
		}
	}
?>