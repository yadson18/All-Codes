<?php  
	class Form{
		public static function input($type, $name, $class = null, $value = null, $placeholder = null, $radioChecked = null){
			if(strcmp($type, "radio") == 0){
				return "<input type=radio name={$name} class={$class} value={$value} {$radioChecked}>";
			}
			else{
				return "<input type='" . $type . "' name='" . $name . "' class='" . $class . "' value='" . $value . "' required placeholder='" . $placeholder . "'>";
			}
		}

		/*public static function select($name, $optionsAmount){
			foreach ($optionsAmount as $options => $data) {
				# code...
				$options = ""
			}

			return "<select name='" . $name . "'>"

					</select>"; 
		} */
	}
?>