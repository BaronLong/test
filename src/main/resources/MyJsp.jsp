<%@ page language="java" import="java.util.*" pageEncoding="uft-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my JSP page. <br>
    <form class="form-horizontal" id="form_table" action="#" th:action="http://localhost:8080/excel/batchImport" enctype="multipart/form-data" method="post">  
    <input class="form-input" type="file" name="filename"></input>  
    <br/>  
    <button type="submit" class="btn">开始导入</button>  
</form>  
  </body>
</html>
