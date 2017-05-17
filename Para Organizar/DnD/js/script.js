$(function(){
    // Arrastar
    $('.drag').draggable({
        // Conecta com a função de reordenar
        connectToSortable: '.drop-container',
        helper: 'clone'
    });
    
    // Pegar e Soltar
    $(".drop-container").sortable({
        //placeholder: 'placeholder',
        connectWith: ".drop-container",
        activate: function (event, ui) {
            console.log($(event['originalEvent']['target']));
        },
        stop: function (event, ui) {
            //Terminar checagem por ID

            var types = ["text", "file", "number"];
            
            for (var i = 0; i < types.length;) {

                if($("#" + types[i])[0] != null){
                    console.log($("#" + types[i])[0]);
                    $(event['originalEvent']['target']).text("");
                    $(event['originalEvent']['target']).append("<input type='file' name='title-1'>");
                    break;
                }
                else{
                     i++;
                }

            }
        }
    });


 
    // Lixeira
    $('.lixeira').droppable({
        hoverClass: 'lixeira-ativa',
        drop: function(event, ui) {
            $(ui.draggable).remove();
        }
    });
    
    // Salvar
    $('.salvar').click(function(){
        var valores = new Array();
        
        $('.drop-container .drag').each(function(){
            valores.push( $(this).html() );
        });
        
        // Faça o que preferir com os valores
        alert(valores);
    });
});