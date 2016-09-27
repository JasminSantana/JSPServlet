<%-- 
    Document   : lista_divisiones
    Created on : 23-sep-2016, 13:38:56
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Divisiones</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Abreviatura</th>
                    <th>Activo</th>
                    <th>Unidad Academica</th>
                    <th>Area</th>
                </tr>
            </thead>
            <tbody>
                <core:forEach items="${divisiones}" var="division">
                    <tr>
                        <td>${division.idDivision}</td>
                        <td>${division.nombre}</td>
                        <td>${division.abreviatura}</td>
                        <td>${division.activo}</td>
                        <td>${division.unidadAcademica}</td>
                        <td>${division.area}</td>
                        <td>
                            <a href="DivisionController?action=cambiar&idDivision=${division.idDivision}">Cambiar</a>
                        </td>
                        <td>
                            <a href="DivisionController?action=borrar&idDivision=${division.idDivision}">Borrar</a>
                        </td>
                    </tr>
                </core:forEach>
            </tbody>
        </table>
        <p>
            <a href="DivisionController?action=agregar">Agregar division</a>
             <a href="index.jsp">Regresar</a>
        </p>
    </body>
</html>
