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
    <h1>Detail  Page</h1>
    <hr>
    ${dto.bno} / ${dto.title} / ${dto.content} / ${dto.writer} 
    <a href="delete?bno=${dto.bno}">삭제</a>
    <a href="list">목록보기</a>
</body>
</html>