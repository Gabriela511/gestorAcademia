<%-- 
    Document   : tablaProfesores
    Created on : 25/09/2018, 04:06:50 PM
    Author     : gabrielaalejandraperez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="../../WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="../../WEB-INF/struts-logic.tld" prefix="logic"%>
<%@taglib uri="../../WEB-INF/struts-html.tld" prefix="html"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            $(function () {
                var availableTags = [
                    "ActionScript",
                    "AppleScript",
                    "Asp",
                    "BASIC",
                    "C",
                    "C++",
                    "Clojure",
                    "COBOL",
                    "ColdFusion",
                    "Erlang",
                    "Fortran",
                    "Groovy",
                    "Haskell",
                    "Java",
                    "JavaScript",
                    "Lisp",
                    "Perl",
                    "PHP",
                    "Python",
                    "Ruby",
                    "Scala",
                    "Scheme"
                ];
                $("#buscadorCURP").autocomplete({
                    source: availableTags
                });
            });
        </script>
    </head>
    <body>
        <div class="card bg-light mb-3">
            <div class="card-body">
                <h5 class="card-title">Buscar Profesor</h5>
                <input type="curp" class="form-control" id="buscadorCURP" placeholder="Inserte el CURP del profesor a buscar">
                <br />
                    <button type="button" class="btn btn-danger" style="padding-top: 2px;">
                        Buscar
                    </button>
            </div>
        </div>

            <br />
            <br />

            <logic:present name="profesorRequest" scope="request">

                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th scope="col">CURP</th>
                            <th scope="col">Nombre del Profesor</th>
                            <th scope="col">Email</th>
                            <th scope="col">Editar</th>
                            <th scope="col">Eliminar</th>
                            <th scope="col">Activo</th>
                        </tr>
                    </thead>
                    <tbody>
                        <logic:iterate id="profesor" name="profesorRequest">
                            <tr>
                                <th>
                                    <bean:write name="profesor" property="curp"/>
                                </th>
                                <td>
                                    <bean:write name="profesor" property="nombre"/>
                                    <bean:write name="profesor" property="primerApellido"/>
                                    <bean:write name="profesor" property="segundoApellido"/>
                                </td>
                                <td>
                                    <bean:write name="profesor" property="correoElectronico"/>
                                </td>
                                <td>
                                    <button type="button" class="btn btn-default">
                                        Ic
                                    </button>
                                </td>
                                <td>
                                    <button type="button" class="btn btn-default">
                                        Ic
                                    </button>
                                </td>
                                <td>
                                    <button type="button" class="btn btn-default">
                                        Ic
                                    </button>
                                </td>
                            </tr>
                        </logic:iterate>

                    </tbody>
                </table>
            </logic:present>
            <logic:notPresent name="profesorRequest" scope="request">
                <div class="error">
                    No hay profesores disponibles. 
                </div>
            </logic:notPresent>
    </body>
</html>
