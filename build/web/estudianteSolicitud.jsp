<%-- 
    Document   : estudianteSolicitud
    Created on : 28/06/2021, 05:52:52 PM
    Author     : Luis Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <style>
            body{
                background-color: black;
            }
            input,textArea{
                color:white;
            }
            input[type="date"]::-webkit-calendar-picker-indicator{
                background-image: url("https://cdn4.iconfinder.com/data/icons/small-n-flat/24/calendar-64.png");
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
        %>
        <nav style="text-align: center;background: #999999">
            <a class="waves-effect waves-light btn" href='formEstudiantes.jsp'>Estudiantes</a>
            <a class="waves-effect waves-light btn" href='formAdministrador.jsp'>Administrador</a>
        </nav>
        <div class="row">
            <form class="col s12" method="post">
                <div class="row">
                    <div class="input-field col s6">
                        <input  name='txtFecha'type="date" class="validate" placeholder="Ingrese su Nombre:">
                        <label>Fecha:</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6">
                        <input placeholder="Ingrese su Identificacion:" type="text" class="validate" name='txtIdentificacion'>
                        <label>Identificacion</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6">
                        <select required name='cmbxFacultad'>
                            <option value="" disabled selected>Seleccione su facultad</option>
                            <option value="1">Ingenieria</option>
                            <option value="2">Artes</option>
                            <option value="3">Ciencias Exactas</option>
                            <option value="4">Ciencias Economicas</option>
                        </select>
                        <label>Facultades</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6">
                        <select required name='cmbxArea'>
                            <option value="" disabled selected>Seleccione su area</option>
                            <option value="1">Trabajo de grado</option>
                            <option value="2">Homologacion</option>
                            <option value="3">Graduacion</option>
                            <option value="4">Matricula</option>
                        </select>
                        <label>Area</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6">
                        <textarea name='txtRequerimiento'class="materialize-textarea"></textarea>
                        <label>Requerimientos</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6">
                        <input  name='txtFecha'type="text" value='Pendiente' readonly>
                        <label>Estado</label>
                    </div>
                </div>
                <input class="waves-effect waves-light btn" type="submit" value='Registrar' name='btnRegistrar'/>
                <input class="waves-effect waves-light btn" type="submit" value='Consultar' name='btnConsultar'/>
            </form>
        </div>
        
        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script>
            document.addEventListener('DOMContentLoaded', function () {
                var elems = document.querySelectorAll('select');
                const options = {classes: '', dropdownOptions: {}};
                var instances = M.FormSelect.init(elems, options);
            });
            const $inputDate = document.querySelector('input[type="date"]');

        </script>
    </body>
</html>
