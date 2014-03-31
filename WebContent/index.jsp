<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="/struts-tags" prefix="s"%>

<%
    String path = request.getContextPath();
%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>

<head>



<title>Struts2+JQuery+JSON</title>

<meta http-equiv="pragma" content="no-cache">

<meta http-equiv="cache-control" content="no-cache">

<meta http-equiv="expires" content="0">

<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">

<meta http-equiv="description" content="This is my page">

<script type="text/javascript" src="<%=path%>/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/json.js"></script>

</head>



<body>

<input id="getJsData" type="button" value="get js vaule" style="width: 113px; "/>
<br>
<input id="getMessage" type="button" value="single Vaule" style="width: 113px; "/>
<br>
<input id="getUserInfo" type="button" value="get UserInfo" style="width: 113px; "/>
<br>
<input id="getList" type="button" value="get List" style="width: 113px; "/>
<br>
<input id="getMap" type="button" value="get Map" style="width: 113px; "/>
<br>


<!-- 要显示信息的层-->

<div id="message"></div>

<form>UserID：<input name="userInfo.userId" type="text" /><br />

UserName：<input name="userInfo.userName" type="text" /><br />

Password：<input name="userInfo.password" type="text" /><br>

<input id="regRe" type="button" value="Reg" /></form>

<s:debug />

</body>

</html>