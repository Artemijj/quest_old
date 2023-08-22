<%--
  Created by IntelliJ IDEA.
  User: artemij
  Date: 04.08.2023
  Time: 00:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Quest</title>
    <link href="../static/main.css" rel="stylesheet" type="text/css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
</head>

<%@page import="quest.model.Quest" %>
<%@page import="java.util.ResourceBundle" %>

<% Quest quest = (Quest) session.getAttribute("quest"); %>
<% ResourceBundle rb = ResourceBundle.getBundle("text"); %>

<body>
<h2 class="position"><%=rb.getString("level")%><%= quest.getLevel()%></h2>
<br><br>

<p><%= quest.getQuestion(quest.getLevel() - 1)%></p>

<br><br>
<form action="/quest">
<%--<form action="WEB-INF/quest.jsp" method="post">--%>
    <input type="radio" name="answer" value="one"/><%= quest.getAnswerOne(quest.getLevel() - 1)%>
    <br>
    <input type="radio" name="answer" value="two"/><%= quest.getAnswerTwo(quest.getLevel() - 1)%>
    <br><br>
    <input type="submit" value="Ok"/>
</form>

<%--<div class="position1">--%>
<%--<button style="margin-right: 5px">YES</button>--%>
<%--<button>NO</button>--%>
<%--</div>--%>
<br><br><br><br><br><br>
<%--<%@page import="quest.model.Quest" %>--%>
<%--<% Quest quest = (Quest) session.getAttribute("quest"); %>--%>
<%= rb.getString("user")%><%= quest.getUser()%>
<br><br>
IP: <%= quest.getIpAddress()%>
<br><br>
<%= rb.getString("gameNumber")%><%= quest.getNumberGames()%>
</body>
</html>
