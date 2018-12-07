<%-- 
    Document   : indexPaciente
    Created on : 02-dic-2018, 12:11:03
    Author     : freak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilo.css">

        <title>Reservar</title>
    </head>
    <body>

        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">ClinicaUtec</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="reservas.jsp">Reservas <span class="sr-only">(current)</span></a></li>
                        <li><a href="#">Perfil</a></li>
                        <li><a href="../index.jsp?cerrar=true">Cerrar Sesion</a></li>

                    </ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>



       <h3 align="center">Consulta</h3>
        
        
        
        <div class="container-fluid fieldset">

        <form class="form-horizontal" action="ServletReserva" method="post">
            
            <br>

            <center><p style="color: #4389f9">Por favor! Seleccione el motivo de su consulta y complete los campos</p></center>

            
                <div class="form-group"> 
                    <div class="col-md-6 ">
                        <label class="control-label">Razon de la consulta : </label><br>
                        <select class="form-control" name="ddlRazonConsulta">
                            <option>Dolor en las articulaciones</option>
                            <option>Dolor en la espalda</option>
                            <option>Gripe Y tos</option>
                            <option>Ansiedad y Depresión</option>
                            <option>Problemas de hipertensión</option>
                            <option>Migraña</option>
                        </select>
                        <br><br>
                    </div>

                    <div class="col-md-6">
                        <label class="control-label">Sistomas :</label><br>
                        <textarea rows="3" class="form-control" name="txtDescripcion"></textarea>
                    </div>
                </div>
            


            
                <div class="form-group">
                    <div class="col-md-6">
                        <label class="control-label">Seleccione la Fecha : </label></br>
                        <input class="form-control" id="date" name="txtFecha" type="date"><br><br>
                    </div>

                    <div class="col-md-6">
                        <label class="control-label">Seleccione la Hora : </label>
                        
                        <div class="radio">
                            
                            <label class="radio-inline">
                                <input type="radio" name="txtHora" value="06:00"> 06:00 am 
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="txtHora" value="06:00"> 11:00 am 
                            </label>
                            
                        </div>
                        
                        <div class="radio">
                            
                            <label class="radio-inline">
                                <input type="radio" name="txtHora" value="06:00"> 07:00 am 
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="txtHora" value="06:00"> 01:00 pm 
                            </label>
                            
                        </div>
                        
                        <div class="radio">
                            
                            <label class="radio-inline">
                                <input type="radio" name="txtHora" value="06:00"> 08:00 am 
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="txtHora" value="06:00"> 02:00 pm 
                            </label>
                            
                        </div>
                        
                        <div class="radio">
                            
                            <label class="radio-inline">
                                <input type="radio" name="txtHora" value="06:00"> 09:00 am 
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="txtHora" value="06:00"> 03:00 pm 
                            </label>
                            
                        </div>
                        
                        <div class="radio">
                            
                            <label class="radio-inline">
                                <input type="radio" name="txtHora" value="06:00"> 10:00 am 
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="txtHora" value="06:00"> 04:00 pm 
                            </label>
                            
                        </div>
                                                
                    </div>
                                                    

            <div class="form-group">
                <div class="col-md-1 col-lg-offset-10">
                <button class="btn btn-primary btnReserva" type="submit" name="btnReserva">Enviar</button>
                <input type="text" name="idUsuario" value="" hidden="true" >
                <input type="text" name="tipo" value="" hidden="true" >
                
                </div>
                
            </div>
        </form>

    </div>


    <footer class="navbar navbar-default navbar-fixed-bottom">
        <div class="container">

        </div>
    </footer>


    <script src="js/jquery-3.3.1.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>



</body>
</html>
