<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>yelogout-page</h3>
<a href="<%=request.getContextPath() %>/yelogout" id="id_out" >로그아웃하기</a>


<script>
cosnt c_out = document.querySelector("#id_out");


const f_out = ()=>{
	event.preventDefault();
	
	console.log("로그아웃클릭");
	let l_form = document.createElement("<form>");
	l_form.action = `<%=request.getContextPath() %>/yelogout`;
	l_form.method = `post`;
	l_form.submit();
	
}

//c_out.addEventListener("click",f_out);
c_out.onclick = f_out;

</script>
</body>
</html>