<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/5.3.7/css/bootstrap.min.css"/>
    <title>List Todos</title>
</head>
<body class="bg-light">

    <div class="container mt-5">
        <!-- Welcome Header -->
        <div class="row mb-4">
            <div class="col text-center">
                <h1 class="display-6 text-primary">Welcome, ${name}</h1>
                <p class="lead text-secondary">Here are your todos:</p>
            </div>
        </div>

        <!-- Todo Table -->
        <div class="row">
            <div class="col">
                <table class="table table-bordered table-striped table-hover shadow-sm bg-white rounded">
                    <thead class="table-dark">
                        <tr>
                            <th>ID</th>
                            <th>Description</th>
                            <th>Target Date</th>
                            <th>Done?</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="todo" items="${todos}">
                            <tr>
                                <td>${todo.id}</td>
                                <td>${todo.description}</td>
                                <td>${todo.targetDate}</td>
                                <td>
                                    <c:choose>
                                        <c:when test="${todo.isDone}">
                                            <span class="badge bg-success">Yes</span>
                                        </c:when>
                                        <c:otherwise>
                                            <span class="badge bg-danger">No</span>
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <!-- jQuery -->
    <script src="/webjars/jquery/3.7.1/jquery.min.js"></script>

    <!-- Bootstrap JS -->
    <script src="/webjars/bootstrap/5.3.7/js/bootstrap.bundle.min.js"></script>
</body>
</html>
