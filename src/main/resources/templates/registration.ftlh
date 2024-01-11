<!DOCTYPE html>
<html>
<head>
    <title>registration</title>
</head>
<body>
<h1>registration</h1><hr>
<h4>Регистрация</h4>
<form action="/registration" method="post">
    Логин: <input type="text" name="login"><br><br>
    Пароль: <input type="password" name="password"><br><br>
    Email: <input type="email" name="email"><br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Зарегистрироваться"/>
</form>
<#if errorMessage??>
    <h2 style="color: red">${errorMessage}</h2>
</#if>
</body>
</html>