<%-- 
    Document   : index
    Created on : 02-dic-2018, 8:02:42
    Author     : freak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>





<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="css/estilo.css">
        <title>Lista Consultas</title>

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilo.css">
        <link rel="stylesheet" href="css/dataTables.bootstrap.min.css">


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
                        <li class="active"><a href="reservas.jsp">Ver consultas <span class="sr-only">(current)</span></a></li>
                        <li><a href="nuevoPaciente.jsp">Añadir Paciente</a></li>
                        <li><a href="#">Generar Receta</a></li>
                        <li><a href="#">Nuevo expediente</a></li>
                        <li><a href="../index.jsp?cerrar=true">Cerrar Sesion</a></li>

                    </ul>

                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>



        <section>
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="box-header">
                            <h3 class="box-title" align="center">Lista de consultas</h3>
                            
                        </div>
                        <div class="clearfix"></div>
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered table-sm table-hover display" id="tblConsultas">
                                <!--cabezare de la tabla-->
                                <thead>
                                    <tr>
                                        <th>N° Reserva</th>
                                        <th>DUI</th>
                                        <th>Paciente</th>
                                        <th>Razon</th>
                                        <th>Fecha</th>
                                        <th>Hora</th>
                                        <th>Accion</th>

                                    </tr>

                                <tbody>
                                </tbody>
                                </thead>
                                <!--fin de cabezera-->

                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
                                    
                                    
                          


        <div class="modal fade" id="confirmar_reserva" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" data-keyboard="false" data-backdrop="static">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <form method="post" action="ServletAsignarDoctor">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title">N° de reserva <span id="n_reserva" name="n_reserva"></span></h4>
                        </div>

                        <div class="modal-body">


                            <div class="form-group col-md-6">
                                <label for="fecha_consulta" class="control-label">Fecha de consulta:</label>
                                <div>
                                    <input id="fecha_consulta" name="fecha_consulta" type="text" class="form-control">
                                </div>

                            </div>


                            <div class="form-group col-md-6">
                                <label for="n_dui" class="control-label">N° DUI:</label>
                                <div>
                                    <input id="n_dui" name="n_dui" type="text" class="form-control">
                                </div>
                            </div>

                            <div class="form-group col-md-6">
                                <label for="hora_consulta" class="control-label">Hora:</label>
                                <div>
                                    <input id="hora_consulta" name="hora_consulta" type="text" class="form-control">
                                </div>
                            </div>

                            <div class="form-group col-md-6">
                                <label for="paciente" class="control-label">Paciente:</label>
                                <div>
                                    <input id="paciente" name="paciente" type="text" class="form-control">
                                </div>
                            </div>

                            <div class="form-group col-md-6">
                                <label for="doctor" class="control-label">Doctor :</label>
                                <div>
                                       <select id="doctor" class="form-control" name="ddlDoctor">
                                           
                            </select>
                                </div>
                            </div>

                            <div class="form-group col-md-6">
                                <label for="estado" class="control-label">Estado de Reserva :</label>
                                <div>
                                      <select id="estado" class="form-control"  name="ddlEstado">
                                            <option>Seleccione....</option>
                                            <option>Pendiente</option>
                                            <option>Aprobado</option>
                                            <option>Denegado</option>
                                        </select>
                                </div>
                            </div>
                                           
                            <input type="text" name ="id_usuario" value="" hidden="true">
                            <input type="text" id="id_reserva" name ="n_reserva" hidden="true">



                        </div>
                        <!-- fin modal body-->

                        <div class="clearfix"></div>
                        <div class="modal-footer">

                            <button type="submit" class="btn btn-primary pull-right" name="btnAsignar" ><span class="fa fa-save"></span> Confirmar</button>
                            <button type="button" class="btn btn-danger pull-left" name="cancelar" data-dismiss="modal"><span class="fa fa-trash"></span> Cancelar</button>
                        </div>
                    </form>

                </div>
            </div>
        </div>



        <footer class="navbar navbar-default navbar-fixed-bottom">
            <div class="container">

            </div>
        </footer>


        <script src="js/jquery-3.3.1.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.dataTables.min.js"></script>
        <script src="js/dataTables.bootstrap.min.js"></script>
        <script src="js/datatable.js"></script>
        <script src="js/CustomJs.js"></script>
        
    </body>
</html>
