<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>hello</title>
</head>
<body>
<form action="/logout" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="Выйти"/>
</form>
</body>
</html>