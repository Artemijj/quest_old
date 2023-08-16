
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Quest</title>
    <link href="static/main.css" rel="stylesheet" type="text/css">
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
<%--    <style>--%>
<%--   p {--%>
<%--    border: 1px solid red;--%>
<%--    padding: 10px;--%>
<%--   }--%>
<%--  </style>--%>
</head>
<body>
<h2 class="position">Start quest.</h2>
<br><br>

<p>Нет страшнее зверя в сибирских лесах, чем разъяренный заяц-мутант.
  Вы видели, какие у него зубы? О, даже медведь боится этих зубов! А, как известно,
  медведи больше ничего не боятся.</p>

<br>
<%--<div class="position1">--%>
<%--<label for="input_name">Enter your name:</label>--%>
<%--</div>--%>
<%--<br>--%>
<%--<div class="position1">--%>
<%--<input type="text" id="input_name" name="name" required size="12" maxlength="12">--%>
<%--</div>--%>
<%--<br><br>--%>

<%--<div class="position1">--%>
<%--&lt;%&ndash;<button onclick="start()">Start</button>&ndash;%&gt;--%>
<%--<button onclick="location.href='/start'">Start</button>--%>
<%--</div>--%>

<form action="/start">
    <div class="position1">
        Enter your name:
    </div>
    <br>
    <div class="position1">
        <input name="name"/>
    </div>
    <br><br>
    <div class="position1">
        <input type="submit" value="Start"/>
    </div>
</form>





<%--<script>--%>
<%--    function start() {--%>
<%--        $.ajax({--%>
<%--            url: '/start',--%>
<%--            type: 'GET',--%>
<%--            contentType: 'application/json;charset=UTF-8',--%>
<%--            async: false,--%>
<%--            success: function () {--%>
<%--                location.reload();--%>
<%--            }--%>
<%--        });--%>
<%--    }--%>
<%--</script>--%>

</body>
</html>
