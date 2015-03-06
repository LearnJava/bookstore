<%--
  Created by IntelliJ IDEA.
  User: art
  Date: 04.03.2015
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>

    <c:forEach var="author" items="${authors}">
        <c:out value="${author}" /><br />
    </c:forEach>

</body>
</html>
