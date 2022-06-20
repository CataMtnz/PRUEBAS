<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Aviones</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

            </head>

            <body>
                <div class="container">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Modelo</th>
                                <th scope="col">Cantidad de Alas</th>
                                <th scope="col">Cantidad Ventanas</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="avion" items="${avionessCapturados}">
                                <tr>
                                    <th scope="row">${avion.id}</th>
                                    <td>${avion.modelo}</td>
                                    <td>${avion.cantidadAlas}</td>
                                    <td>${avion.cantidadVentanas}</td>
                                    <td><a class="btn btn-warning" href="/avion/editar/${avion.id}" role="button">Editar</a></td>
                                    <td><a class="btn btn-danger" href="/avion/eliminar/${avion.id}" role="button">Eliminar</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    </table>
            </body>
            </body>

            </html>