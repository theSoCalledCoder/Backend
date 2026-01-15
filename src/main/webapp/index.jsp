<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="hello" method="post">
    Name: <input type="text" name="name"/>
    <input type="submit" value="Submit"/>
    <input type="submit" formaction="second" value="submit to second"/>
</form>
<%--<a href="second">Hello Servlet</a>--%>

</body>
</html>