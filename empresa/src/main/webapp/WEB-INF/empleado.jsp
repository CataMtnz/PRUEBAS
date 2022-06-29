<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Detalle Empleado</title>
            </head>

            <body>
                <div>
                    <form:form action="/empleado/guardar" method="post" modelAttribute="empleado">
                        <form:label path="nombre">Nombre Empleado</form:label>
                        <form:input path="nombre"></form:input>
                        <br>
                        <form:label path="apellido">Apellido Empleado</form:label>
                        <form:input path="apellido"></form:input>
                        <br>
                        <form:label path="correo">Correo</form:label>
                        <form:input path="correo" type="email"></form:input>
                        <br>
                        <button type="submit">Guardar</button>
                    </form:form>
                </div>
            </body>

            </html>