<%--
  Created by IntelliJ IDEA.
  User: artemij
  Date: 04.08.2023
  Time: 00:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quest</title>
    <link href="../static/main.css" rel="stylesheet" type="text/css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h2 class="position">Level 1</h2>
<br><br>

<p>Some question</p>

<br><br>
<div class="position1">
<button style="margin-right: 5px">YES</button>
<button>NO</button>
</div>
<br><br><br><br><br><br>
<%@page import="quest.model.Quest" %>
<% Quest quest = (Quest) session.getAttribute("quest"); %>
<p> User: <%= quest.getUser()%> </p>
<p> IP: <%= quest.getIpAddress()%> </p>
<p> Game number: <%= quest.getNumberGames()%> </p>
</body>
</html>
