<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cliente</title>
</head>

<body>
    <div>
        <form:form action="/cliente/guardar" method="post" modelAttribute="cliente">
            <form:label path="nombre">Nombre Cliente</form:label>
            <form:input path="nombre" />

            <br>
            <form:label path="apellido">Apellido Cliente</form:label>
            <form:input path="apellido" />
            <br>
            <form:label path="edad">edad</form:label>
            <form:input path="edad" />
            <br>
            <button type="submit">Guardar</button>
        </form:form>
    </div>
</body>

</html>