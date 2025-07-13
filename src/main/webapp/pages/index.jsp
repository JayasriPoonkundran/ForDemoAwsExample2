<!DOCTYPE html>
<html>
<head>
    <title>Student Details Form</title>
</head>
<body>
    <h2>Add Student Details</h2>

    <c:if test="${not empty message}">
        <p style="color: green;">${message}</p>
    </c:if>

    <form method="post" action="submit">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" required><br><br>

        <label for="grade">Grade:</label><br>
        <input type="text" id="grade" name="grade" required><br><br>

        <input type="submit" id="submit" value="Submit">
    </form>
</body>
</html>
