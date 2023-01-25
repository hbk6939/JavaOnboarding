<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.kr.vo.Account"%>
<%@ page import="java.util.HashMap"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<b>계좌 목록</b>
		<table border="1">
			<tr>
				<th>계좌번호</th>
				<th>이름</th>
				<th>입금액</th>
			</tr>
			<%
			Enumeration e = session.getAttributeNames();
			while (e.hasMoreElements()) {
				String id = (String) e.nextElement();
				Account acc = (Account) session.getAttribute(id);
			%>
			<tr>
				<td><%=acc.getId()%></td>
				<td><%=acc.getName()%></td>
				<td><%=acc.getMoney()%></td>
			</tr>
			<%
			}
			%>
		</table>
		<a harf="accproduct.jsp">계좌등록하기</a>
		<a harf="accdelform.jsp">계좌삭제</a>
		<a harf="allaccdelform.jsp">전체계좌삭제</a>
	</center>

</body>
</html>