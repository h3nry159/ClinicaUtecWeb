$(document).ready(function () {
    var table = $('#tblConsultas').DataTable();



    $('#tblConsultas tbody').on('click', '#btn_ver_reserva', function () {
        var data = table.row($(this).parents('tr')).data();
        
        
        $("#n_reserva").text(data[0]);
        $("#id_reserva").val(data[0]);
        $("#n_dui").val(data[1]);
        $("#fecha_consulta").val(data[2]);
        $("#paciente").val(data[3]);
        $("#hora_consulta").val(data[4]);
     
    });

});
