<%-- 
    Document   : indexPaciente
    Created on : 02-dic-2018, 12:11:03
    Author     : freak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilo.css">

        <title>Nuevo Paciente</title>
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
                        <li><a href="indexEnfermera.jsp">Ver consultas <span class="sr-only">(current)</span></a></li>
                        <li class="active"><a href="#">Añadir Paciente</a></li>
                        <li><a href="#">Generar Receta</a></li>
                        <li><a href="#">Nuevo expediente</a></li>
                        <li><a href="../index.jsp?cerrar=true">Cerrar Sesion</a></li>

                    </ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>



        <h3 align="center">Nuevo Paciente</h3>



        <div class="container-fluid fieldset">

            
            <form action="ServletNuevo"  method="post"class="form-horizontal">
                <div class="form-group">
                    <label for="inputNombre" class="col-sm-2 control-label">Nombre :</label>
                    <div class="col-sm-5">
                        <input type="text" name="inputNombre" class="form-control" id="inputNombre" placeholder="">
                    </div>
                </div>
       
        
                <div class="form-group">
                    <label for="inputDui" class="col-sm-2 control-label">N° DUI :</label>
                    <div class="col-sm-5">
                        <input type="text" name="inputDui" class="form-control" id="inputDui" placeholder="">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputCorreo" class="col-sm-2 control-label">Correo :</label>
                    <div class="col-sm-5">
                        <input type="text" name="inputCorreo" class="form-control" id="inputCorreo" placeholder="">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputClave" class="col-sm-2 control-label">Clave :</label>
                    <div class="col-sm-5">
                        <input type="password" name="inputClave" class="form-control" id="inputClave" placeholder="">
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputConfirmar_Clave" class="col-sm-2 control-label">Confirmar Clave :</label>
                    <div class="col-sm-5">
                        <input type="password" name="inputConfirmar_Clave"  class="form-control" id="inputConfirmar_Clave" placeholder="">
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary" name="btn_nuevo_paciente">Registrar</button>
                    </div>
                </div>
            </form>
                

        </div>


        <footer class="navbar navbar-default navbar-fixed-bottom">
            <div class="container">

            </div>
        </footer>


        <script src="js/jquery-3.3.1.js"></script>
        <script src="js/bootstrap.min.js"></script>

    </body>
</html>
