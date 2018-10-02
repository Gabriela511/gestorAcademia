/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function(){
    $("#btn-calcular").click(calcular);
    $("#btn-calcular-post").click(calcularPost);
});

function calcular(){
    if(validarA() && validarB()){
        var a = $("#a").val() * 1;
        var b = $("#b").val() * 1;
        var op = $("#operaciones").val();
        var result = 0;
        
        switch(op){
            case "suma":  result = a+b;
                        break;
            case "resta":  result = a-b;
                        break;
            case "division":  
                        if(b>0){
                            result = a/b;
                        }else{
                            alert('[ERROR MATEMATICO] El valor de B no puede ser 0');
                        }
                        break;
            case "multiplicacion":  result = a*b;
                        break;
            case "modulo":  result = a%b;
                        break;
        }
        $("#span-operacion").html("Operacion "+op);
        $("#span-resultado").html(result);
    }
    
}

function calcularPost(){
    $.post("/cursoJava/operacionesPost",{
        numA : $("#a").val(), 
        numB : $("#b").val()
    },function(response){
        $("#span-resultado").html(response);
    });
}

function validarA(){
    valor = document.getElementById("a").value;
    if( valor === null || valor.length === 0 || /^\s+$/.test(valor) ) {
        alert('[ERROR EN A] El campo no puede estar vacio');
        return false;
    }
    else if( isNaN(valor) ) {
        alert('[ERROR EN A] El campo debe ser numerico');
        return false;
    }
    return true;
}

function validarB(){
    valor = document.getElementById("b").value;
    if( valor === null || valor.length === 0 || /^\s+$/.test(valor) ) {
        alert('[ERROR EN B] El campo no puede estar vacio');
        return false;
    }
    else if( isNaN(valor) ) {
        alert('[ERROR EN B] El campo debe ser numerico');
        return false;
    }
    return true;
}
