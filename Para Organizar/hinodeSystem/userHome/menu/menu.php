<?php
	function menu($title, $linkAndName){
		$nav = "<nav id='menu-nav'>
						  	<h2>{$title}</h2>
								<ul>";
								
		$script = "<script> ";
		
		foreach($linkAndName as $link => $name){
			$nav .= "<li id={$name}>{$name}</li>";
			$script .= "$('#{$name}').on('click', function(){
												 window.location='{$link}';
												 $(this).css('background-color', '#00afcf');
												 $(this).css('color', 'white');
										});
										$('#{$name}').on('mouseout', function(){
												$(this).css('background-color', 'rgba(0,0,0,0)');
												$(this).css('color', '#00afcf');
										});";
		}
		
		return "{$nav}
							</ul>
						</nav>
						{$script}
						</script>";
	}
?>