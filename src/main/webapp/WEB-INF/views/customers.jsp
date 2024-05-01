<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<form action="customers/name" method="get">
    <label name="searchLbl">Name:</label>
    <input type="text" name="name" placeholder="Search customers by name" required/>
    <input type="submit" name="searchBtn" value="Search customer"/>
</form>
<br/>
<form action="customers/save" method="get">
    <input type="submit" name="saveCustomer" value="Add customer"/>
</form>
<table style=" border: 1px solid blue;
  border-collapse: collapse;">
    <thead>
    <tr style=" border: 1px solid blue;">
        <th style=" border: 1px solid blue;">Id</th>
        <th style=" border: 1px solid blue;">Name</th>
        <th style=" border: 1px solid blue;">Address</th>
        <th style=" border: 1px solid blue;">Edit</th>
        <th style=" border: 1px solid blue;">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.address}</td>
            <td>
                <form action="customers/update/${customer.id}" method="get">
                    <input type="submit" value="Edit">
                </form>
            </td>
            <td>
                <form action="customers/delete/${customer.id}" method="post">
                    <input type="submit" value="Delete">
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
