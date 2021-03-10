<%--
  Created by IntelliJ IDEA.
  User: artemis
  Date: 3/9/21
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>

<h2>Pick a color to display</h2>

<form action="/pickcolor" method="POST">

    <input name="favorite_color" type="text" placeholder="Enter favorite color here.">
    <br>
    <input type="submit" value="Pick Color">

</form>

</body>
</html>
