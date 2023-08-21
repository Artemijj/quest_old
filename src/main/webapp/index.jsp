
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Quest</title>
    <link href="static/main.css" rel="stylesheet" type="text/css">
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
    <meta charset="UTF-8">
<%--    <style>--%>
<%--   p {--%>
<%--    border: 1px solid red;--%>
<%--    padding: 10px;--%>
<%--   }--%>
<%--  </style>--%>
</head>
<%@page import="java.util.ResourceBundle" %>

<% ResourceBundle rb = ResourceBundle.getBundle("text"); %>
<body>
<h2 class="position"><%= rb.getString("startQuest")%></h2>
<br><br>

<p>Нет страшнее зверя в сибирских лесах, чем разъяренный заяц-мутант.
  Вы видели, какие у него зубы? О, даже медведь боится этих зубов! А, как известно,
  медведи больше ничего не боятся.</p>

<br>

<form action="start">
    <div class="position1">
        <%= rb.getString("enterName")%>
    </div>
    <br>
    <div class="position1">
        <input name="user"/>
    </div>
    <br><br>
    <div class="position1">
        <input type="submit" value="<%= rb.getString("startButton")%>"/>
    </div>
</form>

</body>
</html>
