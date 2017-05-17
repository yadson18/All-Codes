$( document ).ready(function() {
	var replacedWord;
	var letters = [];
	var topArray = 0;
	var tryed = 0;
	var json;
	
	getNewTipAndWord();
	
	function getNewTipAndWord(){
		$.get("getTipWord.php", function(data, status){
		  json = JSON.parse(data);
			
			$("#tip").append(json['tip']);
			
			var hideLetter = "";
			for(var i = 0; i < json['word'].length; i++){
				var char = json['word'].charAt(i);
				if(char === " "){
					hideLetter += char + '<span style="padding-left: 9px"></span>';
				}
				else if(char === "-"){
					hideLetter += '- ';
				}
				else{
					hideLetter += '_ ';
				}
			}
			$("#word").append(hideLetter);
			replacedWord = json['word'];
			replacedWord = totalReplace(replacedWord);
		});
	}
	
	function quantityLetters(word, letra){
		var size = 0;
			
		for(var i = 0; i < word.length;){
			if(letra == word[i]){
				size++;
				i++;
			}
			else{
				i++;
			}
		}
		return size;
	}
	
	function showHideBody(tryed){
		if(tryed === 1){
			$("#head").removeClass("hideBody");
		}
		else if(tryed === 2){
			$("#body").removeClass("hideBody");
		}
		else if(tryed === 3){
			$("#leftHand").removeClass("hideBody");
		}
		else if(tryed === 4){
			$("#rightHand").removeClass("hideBody");
		}
		else if(tryed === 5){
			$("#leftFoot").removeClass("hideBody");
		}
		else if(tryed === 6){
			$("#rightFoot").removeClass("hideBody");
		}
		else{
			$("#doll").children().addClass("hideBody");
		}
	}
	
	function totalReplace(word){
		var wordReplace, replaced, chars;
		wordReplace = word;
		chars = ['-', ' '];
	
		for(var i = 0; i < chars.length; i++){
			for(var j = 0; j < wordReplace.length; j++){
				replaced = wordReplace.replace(chars[i], '');
				wordReplace = replaced;
			}
		}
		return wordReplace;
	}
	
	function gameOver(){
		$(".letter").attr("disabled", "disabled");
	}
	
	function removeTipAndWord(){
		$(".letter").removeAttr("disabled", "disabled");
		$(".letter").css("background-color", "white");
		$("#tip").text("");
		$("#word").text("");
	}
	
	function changeLetter(word, letter){
		var array = $("#word").text().split(" ");
		var htmlWord = "";
		for(var i = 0; i < word.length;){
			if(word.charAt(i) === letter){
				array[i] = letter;
				i++;
			}
			else{
				i++;
			}
		}
		
		for(var j = 0; j < array.length; j++){
			htmlWord += array[j] + ' ';
		}
		
		return htmlWord;
	}
	
	function setUserVictory(victory){
		$.post("game-actions/setUserVictory.php", 
			{ 'victory' : victory }, function(data, status){
				var victory = JSON.parse(data);
				$("#totalVictory").text(victory["totalVictory"]);
			}
		);
	}
	
	function clickWord(e){
		var letter, quantity, arr, string;

		$(this).attr("disabled", "disabled");
	
		letter = $(this).text().toLowerCase();
		quantity = parseInt(quantityLetters(replacedWord, letter));
		if(quantity > 0){
			$("#word").text(changeLetter(json['word'], letter));
			for(var i = 0; i < quantity; i++){
				letters[topArray++] = letter;
			}
			if(topArray == replacedWord.length){
				setUserVictory(1);
				alert("acertou");
				replacedWord = "";
				topArray = 0;
				letters = [];
				tryed = 0;
				showHideBody('resetBody');
				removeTipAndWord();
				getNewTipAndWord();
			}
		}
		else{
			tryed++;
			showHideBody(tryed);
			if(tryed == 6){
				gameOver();
				alert('Game over');
			}
		}
	}

	$(".letter").on("click", clickWord);
});

