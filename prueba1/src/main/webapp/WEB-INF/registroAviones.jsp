<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Registro</title>
            </head>

            <body>
                <div>|
                    <c:if test="${msgError!=null}">
                        <c:out value="${msgError}"></c:out>
                    </c:if>
                    <form:form action="/avion/guardar" method="post" modelAttribute="avion">

                        <form:label path="modelo">Modelo: </form:label>
                        <form:input path="modelo" for="modelo" />
                        <br>
                        <form:label path="cantidadAlas">Cantidad de Alas: </form:label>
                        <form:input type="number" path="cantidadAlas" for="cantidadAlas" />
                        <br>
                        <form:label path="cantidadVentanas">Cantidad de Ventanas: </form:label>
                        <form:input type="number" path="cantidadVentanas" for="cantidadVentanas" />
                        <br>
                        <input type="submit" value="Registrar">

                    </form:form>

                </div>
            </body>
            </body>

            </html>