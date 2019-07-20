<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="User_update" method="post">
		id:<input name="id"  value="${user.id }" /> <br />
		name:<input name="name" value="${user.name }" /> <br />
		birthday:<input name="birthday" value="${user.birthday }" /> <br />
		money:<input name="money" value="${user.money }" /> <br />
		<button type="submit">GO</button>
	</form>
</body>
</html>