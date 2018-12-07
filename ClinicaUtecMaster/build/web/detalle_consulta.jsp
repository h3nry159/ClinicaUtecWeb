<%-- 
    Document   : confirmacion
    Created on : 02-dic-2018, 17:24:20
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
        <title>Confirmación</title>
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
        
        
        <h3 align="center">Confirmacion</h3>
        <div class="container-fluid fieldset">
            
           
           <div class="col-lg-12 confirmacion"><p>Su cita se ha reservado para la fecha <strong><%=request.getAttribute("fecha")%></strong> a las horas <strong><%=request.getAttribute("hora")%></strong></p></div>
           <div class="col-lg-6 confirmacion">
                <p>sus datos personales a los <br>cuales se realizo su reserva son : </p><br>
                <p>Estado : <span></span></p>
                <p>N° Reserva : <span></span></p>
            </div>
            
            
            <div class="col-lg-6 confirmacion">
            
            <p>Nombre : <span></span></p>
            <p>Correo : <span></span></p>
            <p>Dui : <span></span></p>
            </div>
            
            <div class="col-lg-12 confirmacion"><p style="color:#4389f9">!Gracias¡, por favor visite el historial de sus reservas dentro de 24hrs, para verificar su estado.</p></div>
        </div>
        
        
        
        
        
    <footer class="navbar navbar-default navbar-fixed-bottom">
        <div class="container">

        </div>
    </footer>
    <script src="js/jquery-3.3.1.js"></script>
    <script src="js/bootstrap.min.js"></script>

        
    </body>
</html>
