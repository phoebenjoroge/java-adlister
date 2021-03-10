<%--
  Created by IntelliJ IDEA.
  User: artemis
  Date: 3/9/21
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Number</title>
</head>
<body>
<h2>Guess what number I'm thinking of</h2>

<form action="/guess" method="POST">

    <input name="guess_number" type="text" placeholder="Enter your number here.">
    <br>
    <input type="submit" value="Guess Number">

</form>
</body>
</html>
