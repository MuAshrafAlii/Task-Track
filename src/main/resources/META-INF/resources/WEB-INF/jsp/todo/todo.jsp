<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add Todo Page</title>
    <link rel="stylesheet" href="/webjars/bootstrap/5.3.7/css/bootstrap.min.css"/>

    <link rel="stylesheet" href="/webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css"/>
</head>
<body>
<div class="container">
    <h1>Enter Todo Details</h1>

    <form:form method="post" modelAttribute="todo">
        <form:hidden path="id"/>
        <form:hidden path="isDone"/>

        <fieldset>
            <form:label path="description">Description:</form:label>
            <form:input type="text" path="description"/>
            <form:errors path="description" cssClass="text-warning" />
        </fieldset>

        <fieldset>
            <form:label path="targetDate">Target Date:</form:label>
            <form:input type="text" path="targetDate"/>
            <form:errors path="targetDate" cssClass="text-warning" />
        </fieldset>

        <input type="submit" class="btn btn-success"/>
    </form:form>

</div>


<<!-- jQuery -->
     <script src="/webjars/jquery/3.7.1/jquery.min.js"></script>

     <!-- Bootstrap JS -->
     <script src="/webjars/bootstrap/5.3.7/js/bootstrap.bundle.min.js"></script>

     <script src="/webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>

     <script>
         $(document).ready(function () {
             // Initialize Bootstrap Datepicker
             $('#targetDate').datepicker({
                 format: 'yyyy-mm-dd',   // format compatible with Spring's default LocalDate binder
                 todayHighlight: true,   // highlights today's date
                 autoclose: true         // closes picker after selection
             });
         });
     </script>
</body>
</html>
