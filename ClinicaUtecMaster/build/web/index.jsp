<%-- 
    Document   : login
    Created on : 02-dic-2018, 6:09:56
    Author     : freak
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilo.css">


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


                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>



    <center><h1>Bienvenido</h1></center>


    <div class="container-fluid login"> 

        <form class="form-horizontal" action="ServletLogin" method="post">

            <div class="container-fluid formLogin"> 
                <div class="form-group">

                    <label class="control-label" for ="usuario">USUARIO :</label>  
                    <input class="form-control" id="usuario" value="" type ="text" name="txtUsuario" placeholder="Ingrese su documento de identidad "required>    
                </div>   





                <div class="form-group">    
                    <label class="control-label" for="clave">CLAVE : </label>
                    <input class="form-control" id="clave" type ="password" value="" name="txtContra"  placeholder="Ingrese su contraseña" required>
                </div>  
                
                <div class="form-group ">
                    <label class="control-label">Seleccione el tipo de Usuario : </label>
                    <div class="radio">
                        <label>
                            <input type="radio" name="paciente" id="paciente" value="1">
                            Paciente
                        </label>
                    </div>
                    <div class="radio">
                        <label>
                            <input type="radio" name="doctor" id="doctor" value="2">
                            Doctor
                        </label>
                    </div>
                    <div class="radio">
                        <label>
                            <input type="radio" name="enfermera" id="enfermera" value="3">
                            Enfermera
                        </label>
                    </div>
                </div>

                <div class="form-group">
                    <div class="pull-right"><button type="submit" name="btnLogin" class="btn btn-primary">Login</button></div>
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
