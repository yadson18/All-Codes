<?php
	function printKeyboard($sizeX, $sizeY){
		$letters = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','W','U','V','X','Y','Z'];
		$buttons = "";
		$last = 0;
		
		if(($sizeX * $sizeY) <= sizeof($letters)){
			for($i = 0; $i < $sizeY; $i++){
				for($j = 0; $j < $sizeX; $j++){
					$buttons .= "<button class='letter'>{$letters[$last++]}</button>";
				}
				$buttons .= "<br>";
			}
		
			for($k = $last; $k < sizeof($letters); $k++){
				$buttons .= "<button class='letter'>{$letters[$k]}</button>";
			}
		
			echo $buttons;
		}
		else{
			return false;
		}
	}
?>