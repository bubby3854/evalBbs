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
 <h1>List Page</h1>
 <c:forEach var="dto" items="${list}">
    ${dto.bno} / <a href="detail?bno=${bno}">${dto.title}</a> /${dto.content} / ${dto.regdate}<br>
 </c:forEach>
 <br>
 <br>
<div><a href="writeForm">글 작성하기</a></div>
</body>
</html>