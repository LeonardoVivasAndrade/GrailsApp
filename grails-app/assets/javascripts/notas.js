$("#notaP1, #notaP2, #notaP3, #notaExamen").change(function(){
    var n1 = parseFloat($("#notaP1").val()) * 0.23;
    var n2 = parseFloat($("#notaP2").val()) * 0.23;
    var n3 = parseFloat($("#notaP3").val()) * 0.23;
    var ne = parseFloat($("#notaExamen").val()) * 0.31;

    var result = n1+n2+n3+ne;

    $("#notaFinal").val(result.toFixed(2).toString().replace(".", ","));

});