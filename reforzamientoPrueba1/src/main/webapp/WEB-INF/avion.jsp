<!--es el index de la clase, pagina principal y ! para crear estructura-->

<!--importamos dependencias internas de otras paginas Springboot-->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
            <!DOCTYPE html>
            <html lang="en">

            <!--creamos la estructura del jsp-->
            <!--para formulario-->
            <!--div cajas-->
            <!--path=rutas -> de los atributos del objeto para captar información-->
            <!--label escribe en la pagina web -->

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Avion</title>
            </head>

            <body>
                <form:form action="/avion" method="post" modelAttribute="avion">
                    <form:label path="cantidadVentanas"> Cantidad de Ventanas
                    </form:label>
                    <!--para asociar datos al atributo-->
                    <form:input path="cantidadVentanas" type="number" />
                    <br>
                    <form:label path="cantidadAsientos"> Cantidad de Asientos
                    </form:label>
                    <form:input path="cantidadAsientos" type="number" />
                    <br>
                    <form:label path="modelo"> Modelo de Avion
                    </form:label>
                    <form:input path="modelo" type="text" />
                    <br>
                    <button type="submit">Guardar</button>
                </form:form>
            </body>

            </html>