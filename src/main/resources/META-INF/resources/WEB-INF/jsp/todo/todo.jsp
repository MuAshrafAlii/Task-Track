<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
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

<%@ include file="../common/footer.jspf" %>

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