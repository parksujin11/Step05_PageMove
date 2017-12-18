<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
System.out.println("test/go6.jsp 요청 처리중....");
//아래와 같은 리다일렉트 이동을 javascript 로 로딩시켜서 이동 시킬 수 있다.
//response.sendRedirect("result6.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test/go6.jsp</title>
</head>
<body>
<script>
	alert("result6.jsp 페이지로 리다이렉트 이동 합니다.")
//자바스크립트를 이용한 리다이렉트 이동 
	location.href="result6.jsp";
</script>
</body>
</html>