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

<p><%= rb.getString("question_" + quest.getCurrentState().getLabel())%></p>

<br><br>
<form action="quest">
    <input type="radio" name="answer" value="one"/><%= rb.getString("answerOne_" + quest.getCurrentState().getLabel())%>
    <br>
    <input type="radio" name="answer" value="two"/><%= rb.getString("answerTwo_" + quest.getCurrentState().getLabel())%>
    <br><br>
    <input type="submit" value="Ok"/>
</form>

<br><br><br><br><br><br>
<%= rb.getString("user")%><%= quest.getUser()%>
<br><br>
IP: <%= quest.getIpAddress()%>
<br><br>
<%= rb.getString("gameNumber")%><%= quest.getNumberGames()%>
</body>
</html>
