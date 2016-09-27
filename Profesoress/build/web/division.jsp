<%-- 
    Document   : division
    Created on : 23-sep-2016, 13:47:27
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Division</title>
    </head>
    <body>
        <form action="DivisionController" method="post">
            <fieldset>
                <legend>Registro de divisiones </legend>
                <div>
                    <label for="idDivision">Id division:</label>
                    <input type="text" name="idDivision"
                           value="${division.idDivision}"
                           placeholder="Id de division"
                           readonly="readonly"/> 
                </div>
                <div>
                    <label for="nombre">Nombre:</label>
                    <input type="text" name="nombre"
                           value="${division.nombre}"
                           placeholder="Nombre de la division"
                           /> 
                </div>
                 <div>
                    <label for="abreviatura">Abreviatura:</label>
                    <input type="text" name="abreviatura"
                           value="${division.abreviatura}"
                           placeholder="Abreviatura Division"
                           /> 
                </div> 
                           <div>
                    <label for="activo">Activo:</label>
                    <input type="text" name="activo"
                           value="${division.activo}"
                           placeholder="Activo"
                           /> 
                </div>   
                           
                <div>
                    <label for="unidadAcademica">Unidades Academicas:</label>
                    <input type="number" name="unidadAcademica"
                           value="${division.unidadAcademica}"
                           placeholder="Unidad Academica"
                           /> 
                </div>
                <div>
                    <label for="area">Area:</label>
                    <input type="text" name="area"
                           value="${division.area}"
                           placeholder="Area de division"
                           /> 
                </div>  
                <div>
                    <input type="submit" value="Guardar"/>
                </div>
        </form>
    </body>
</html>
