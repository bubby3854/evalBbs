<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>WriteForm Page</h1>
    <hr>
    <form action="write" method="post">
    작성자<input type="text" name="writer"><br>
    제목<input type="text" name="title"><br>
    내용<input type="text" name="content"><br>
    <input type="submit" name="등록"><br>



    </form>
    
</body>
</html>