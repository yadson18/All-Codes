<?php
	class TagHtml{
		public static function css($file){
			return "<link rel='stylesheet' type='text/css' href='/hinodeSystem/SistemaLogin/css/{$file}'>";
		}
		
		public static function script($file){
			return "<script src='/hinodeSystem/SistemaLogin/js/{$file}'></script>";
		}
		
		public static function formCreate($method, $action, $options = null){
			$form = "<form action='{$action}' ";
			if(strcmp($method, 'post')){
				$form .= "method='POST' ";
			}
			else if(strcmp($method, 'get')){
				$form .= "method='GET' ";
			}
			else if(strcmp($method, 'enctype')){
				$form .= "enctype='multipart/form-data' method='POST' ";
			}
			
			foreach($options as $index => $option){
				$form .= "{$index}={$option} ";
			}
			
			return "{$form}>";
		}
		
		public static function formEnd(){
			return "</form>";
		}
		
		public static function input($type, $options){
			return "<input type='{$type}' {$options}>";
		}
	}
?>