<?php
	function menu($link1, $link2, $link3){
		echo "<nav>
				<ul>
					<li>
						<a href='" . $link1 . "'>Login</a>
					</li>
					<li>
						<a href='" . $link2 . "'>Contact Us</a>
					</li>
					<li>
						<a href='" . $link3 . "'>Undefined</a>
					</li>
				</ul>
			  </nav>";
	}
?>