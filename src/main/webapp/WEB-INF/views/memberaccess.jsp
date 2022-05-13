<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${accessUser }로 로그인 하였습니다.
<a href="<%=request.getContextPath() %>/yelogout">로그아웃하기</a>

</html>