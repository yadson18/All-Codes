<?php
	function menu($link, $nome){
		echo "<nav>
				<ul>
					<li>
						<a href='" . $link . "'>" . $nome . "</a>
		     <li>
				</ul>
			  </nav>";
	}
?>