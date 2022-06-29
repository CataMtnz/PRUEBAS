<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Clientes</title>
            </head>

            <body>
                <div class="container">

                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">ID</th>
                                <th scope="col">Nombre Cliente</th>
                                <th scope="col">Apellido Cliente</th>
                                <th scope="col">Edad</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="" items="${registroCliente}">
                                <tr>
                                    <th>id</th>
                                    <th scope="row">${cliente.id}</th>
                                    <td>${cliente.nombre}</td>
                                    <td>${cliente.apellido}</td>
                                    <td>${cliente.edad}</td>
                                    <td><a class="btn btn-warning" href="/cliente/editar/${cliente.id}" role="button">Editar</a></td>
                                    <td><a class="btn btn-danger" href="eliminar/${cliente.id}" role="button">Eliminar</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </body>

            </html>