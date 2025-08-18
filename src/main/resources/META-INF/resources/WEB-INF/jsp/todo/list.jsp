<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Todos</title>
</head>
<body>

    <h1> Welcome ${name} </h1>
    <h3>Your Todos</h3>
    <table border="1" cellpadding="5" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>Description</th>
            <th>Target Date</th>
            <th>Done?</th>
        </tr>

        <!-- Loop through todos list -->
        <c:forEach var="todo" items="${todos}">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.isDone}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>