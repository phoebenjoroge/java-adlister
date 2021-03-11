<%--
  Created by IntelliJ IDEA.
  User: artemis
  Date: 3/10/21
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ad display</title>
</head>
<body>
<h1>Display Ads</h1>
<c:forEach var="Ad" items="${ads}">
    <div class="Ad">

        <ul>
            <li>${Ad.id}</li>
           <strong><li>${Ad.title}</li></strong>
            <li>${Ad.description}</li>
            <li>user id: ${Ad.userId}</li>
        </ul>
<%--        <p>${Ad.id}</p>--%>
<%--        <p>${Ad.title}</p>--%>
<%--        <p>user id: ${Ad.description}</p>--%>
    </div>
</c:forEach>
<style>
   li{list-style-type: none}
</style>
</body>
</html>
