<%--
  Created by IntelliJ IDEA.
  User: Rais Ahmad
  Date: 9/24/2021
  Time: 9:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title >JSP - Hello! </title>
    <title >User Management Application</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>

<body>
<h1 style="color: orange">
    <%= "Hi!" %>
</h1>

<h2 style="color: orangered"> Welcome to User Management Application! </h2>
<br/>

<header>
    <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
        <div>
            <a href="https://www.javaguides.net" class="navbar-brand"> User
                Management Application </a>
        </div>

    </nav>
</header>
<br>
            <h2 ><a style="color: orange" href="user-list.jsp"> User List </a></h2>
            <h2 ><a style="color: orange" href="user-form.jsp"> User Form </a></h2>

</body>
</html>