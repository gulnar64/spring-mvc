
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--    <title>Title</title>--%>
</head>
<body>
<form action="http://localhost:8080/spring-mvc/customers/update" method="post">

    <label>Name: </label>
    <input type="text" name="name" value="${customer.name}">
    <br/>
    <label>Address: </label>
    <input type="text" name="address" value="${customer.address}">
    <input type="hidden" name="id" value="${customer.id}">
    <input type="submit" name="Save">
</form>
</body>
</html>
