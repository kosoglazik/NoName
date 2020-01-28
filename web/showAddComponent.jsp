<%-- 
    Document   : showAddComponent
    Created on : Jan 27, 2020, 10:06:01 AM
    Author     : pupil
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Добавление компонента</title>
    </head>
    <body>
        <h1>Создать компонент</h1>
    <from action="createComponent" method="POST">
        Тип компонента: <input type="text" name="type"><br>
        Название копмпонента: <input type="text" name="nameComponent"><br>
        Описание товара: <input type="text" name="description"><br>
        Цена: <input type="text" name="price"><br>
        Количество: <input type="text" name="quantity"><br>
        <input type="submit" value="Создать">
    </from>
    </body>
</html>
