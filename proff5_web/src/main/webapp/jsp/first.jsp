<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	First JSP1
	<form method="get">
		<input type="text" name="polk"> <input type="submit" />
		<select name="varies"><option value= "1X">Variant 1</option><option value="2X">Variant 2</option></select>
	</form>
	<%
		Object obj = request.getAttribute("nabor");
		if (obj != null) {
			List<String> list = (List<String>) obj;

			for (String str : list) {
				out.println(str + "<br>");
			}
		}
	%>
	<div class="block">1212</div>
</body>
</html>