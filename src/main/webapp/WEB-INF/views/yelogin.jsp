<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>yelogin-page</h3>
<form action="<%=request.getContextPath() %>/login" method="post">
아이디<input type="text" name="username" value="" ><hr>
비밀번호<input type="password" name="password" value="" ><hr>
로그인유지(3일)<input type="checkbox" name="" value="">
<button>전송</button>
</form>
</body>
</html>