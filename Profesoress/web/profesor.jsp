<%-- 
    Document   : profesor
    Created on : 21-sep-2016, 10:34:32
    Author     : carlos arriaga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formularo de profesores</title>
    </head>
    <body>
        <form action="ProfesorController" method="post">
            <fieldset>
                <legend>Registro de profesores </legend>
                <div>
                    <label for="idProfesor">Id profesor:</label>
                    <input type="text" name="idProfesor"
                           value="${profesor.idProfesor}"
                           placeholder="Id de profesor"
                           readonly="readonly"/> 
                </div>
                <div>
                    <label for="nombre">Nombre:</label>
                    <input type="text" name="nombre"
                           value="${profesor.nombre}"
                           placeholder="Nombre del profesor"
                           /> 
                </div>
                <div>
                    <label for="experiencia">Experiencia:</label>
                    <input type="number" name="experiencia"
                           value="${profesor.experiencia}"
                           placeholder="Experiencia en años"
                           /> 
                </div>
                <div>
                    <label for="carrera">Carrera:</label>
                    <input type="text" name="carrera"
                           value="${profesor.carrera}"
                           placeholder="Carrera de abscripción"
                           /> 
                </div>  
                <div>
                    <input type="submit" value="Guardar"/>
                </div>
        </form>
            
    </body>
</html>
