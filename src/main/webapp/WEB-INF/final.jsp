<%--
  Created by IntelliJ IDEA.
  User: artemij
  Date: 18.08.2023
  Time: 01:07
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
<h2 class="position">
    <%
        if (quest.getState().getMessage().equals("win")) {
//            out.println(quest.getState().getClass().getSimpleName());
            out.println(rb.getString("messageWin"));
        } else if (quest.getState().getMessage().equals("fail")) {
            out.println(rb.getString("messageFail"));
        }
    %>
</h2>

<form action="/final">
    <input type="submit" value="<%= rb.getString("restartButton")%>" />
</form>



<br><br><br><br><br><br>
<%= rb.getString("user")%><%= quest.getUser()%>
<br><br>
IP: <%= quest.getIpAddress()%>
<br><br>
<%= rb.getString("gameNumber")%><%= quest.getNumberGames()%>
</body>
</html>
