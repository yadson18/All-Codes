<?php  
	require_once "Monster.php";
	require_once "Treinador.php";
	
	$trainerP = new PokeTrainer("Yadson", "Matheus", 18);
	$poke1 = new Pokemon("larva", "água", "poke",  15);
	$trainerP-> addMonster($poke1);
	
	$trainerD = new DigiTrainer("Izabelly", "Arruda", 16);
	$digi1 = new Digimon("digi", "mon", 10);
	$trainerD-> addMonster($digi1);
	
	$trainerP-> duelar($trainerD);
?>