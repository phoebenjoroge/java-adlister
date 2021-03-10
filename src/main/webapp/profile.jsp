<%--
  Created by IntelliJ IDEA.
  User: artemis
  Date: 3/5/21
  Time: 1:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Profile</title>


</head>
<body>

<jsp:include page="partials/nav.jsp" />
<main class="container">

    <h2>Profile Page</h2>

    <c:choose>

        <c:when test="${param.containsKey('username')}">
            <p>Hello there ${param.username}</p>
        </c:when>
        <c:otherwise>
            <p>Hello Unauthenticated User!!!</p>
        </c:otherwise>

    </c:choose>

</main>


</body>
</html>
