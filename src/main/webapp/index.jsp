<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="User_save" method="post">
		name:<input name="name" /> <br />
		birthday:<input name="birthday" /> <br />
		money:<input name="money" /> <br />
		<button type="submit">GO</button>
	</form>
	
	<hr />
	<hr />
	<hr />
	
	<table>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>birthday</td>
			<td>money</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="l">
			<tr>
			<td>${l.id }</td>
			<td>${l.name }</td>
			<td>${l.birthday }</td>
			<td>${l.money }</td>
			<td>
			<a href="User_updateUI?id=${l.id }">修改</a>
			|
			<a href="User_delete?id=${l.id }">删除</a>
			</td>
			<tr/>
		</c:forEach>
	</table>
	
	<hr />
	<hr />
	<hr />
	
	
</body>
</html>