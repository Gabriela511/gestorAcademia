<%-- 
    Document   : principal
    Created on : 18/07/2018, 11:23:31 AM
    Author     : gabrielaalejandraperez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="../WEB-INF/struts-tiles.tld" prefix="tiles" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title><tiles:getAsString name="title"/></title>
        
        <link rel="icon" type="image/png" href="resources/images/icono.png" />
        <link href="resources/styles/estilos.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js" integrity="sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em" crossorigin="anonymous"></script>
    </head>
    <body>
         
        <div>
                <tiles:insert name="menu"/>
        </div>
       
            
        <div id="contenedor">
            <!-- <div id="body">-->
                <tiles:insert name="body"/>
            <!--</div>    -->
        </div>
            
        <div id="footer">
            <tiles:insert name="footer"/>
        </div>

    </body>
</html>
