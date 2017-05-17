<?php
	$index = rand(0, 1);
	$json = [
		0 => [
			'tip' => 'É um felino.',
			'word' => 'tigre'
		],
		1 => [
			'tip' => 'Banda psicodélica famosa.',
			'word' => 'pink-floyd'
		]
	];
	
	echo json_encode($json[$index]);
?>