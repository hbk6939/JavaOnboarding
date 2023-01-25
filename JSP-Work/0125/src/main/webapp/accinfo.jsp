<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<style>
body {
	margin: 0 auto;
	width: 280px;
}

.container {
	padding: 10px;
	border: 1px solid;
}

.header {
	height: 40px;
}

.row {
	height: 30px;
}

.title {
	width: 70px;
	float: left;
	font-weight: bold;
}

.input {
	float: left;
}

input[type='submit'] {
	font-weight: bold;
	width: 120px;
	background-color: lightgrey;
}
</style>
</head>
<%

/*	String id = (String)request.getAttribute("id");
	String name = (String)request.getAttribute("name");
	int money = (Integer)request.getAttribute("money");
	String type = (String)request.getAttribute("type");
	String grade = (String)request.getAttribute("grade");*/
	
	// 화면을 통해 가져올 떄
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	int money = Integer.parseInt(request.getParameter("money"));
	String type = request.getParameter("type");
	String grade = request.getParameter("grade");
%>

<body>
	<center>
		<form>
			<div class="header">
				<h3>계좌 정보</h3>
			</div>
			<div class="container">
				<div class="row">
					<div class="title">계좌번호</div>
					<div class="input">
						<%-- <input type="text" name="id" id='id' value=<%=id %> readonly> --%>
						<input type="text" name="id" id='id' value=${param.id} readonly>
					</div>
				</div>
				<div class="row">
					<div class="title">이름</div>
					<div class="input">
						<%-- <input type="text" name="name" id='name' value=<%=name %> readonly> --%>
						<input type="text" name="name" id='name' value=${param.name} readonly>
					</div>
				</div>
				<div class="row">
					<div class="title">입금액</div>
					<div class="input">
						<%-- <input type="text" name="money" id='money' value=<%=money %> readonly> --%>
						<input type="text" name="money" id='money' value=${param.money} readonly>
					</div>
				</div>
				<div class="row">
					<div class="title">종류</div>
					<div class="input">
						<%-- <input type="text" name="type" id='type' value=<%=type %> readonly> --%>
						<input type="text" name="type" id='type' value=${param.type} readonly>
					</div>
				</div>
				<div class="row">
					<div class="title">등급</div>
					<div class="input">
						<%-- <input type="text" name="grade" id='grade' value=<%=grade %> readonly> --%>
						<input type="text" name="grade" id='grade' value=${param.grade} readonly>
					</div>
				</div>
			</div>
		</form>
	</center>

</body>

</html>