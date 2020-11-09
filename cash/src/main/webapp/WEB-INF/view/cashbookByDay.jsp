<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/WEB-INF/view/inc/menu.jsp"></jsp:include>
	<h1>cashbookListByDay</h1>
	<div>
		<a href="/admin/cashbookByDay/pre/${currentYear}/${currentMonth}/${currentDay}">
			이전
		</a>
		
		<span>${currentYear}년 ${currentMonth}월 ${currentDay}일</span>
		
		<a href="/admin/cashbookByDay/next/${currentYear}/${currentMonth}/${currentDay}">
			이후
		</a>
		
	</div>
	<a href="/admin/addCashbook?currentYear=${currentYear}&currentMonth=${currentMonth}&currentDay=${currentDay}">수입/지출 입력</a>
	<table border="1">
		<thead>
			<tr>
				<th>cashbookId</th>
				<th>cashbookKind</th>
				<th>categoryName</th>
				<th>cashbookPrice</th>
				<th>cashbookContent</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="c" items="${cashbookList}">
				<tr>
					<td>${c.cashbookId}</td>
					<td>${c.cashbookKind}</td>
					<td>${c.categoryName}</td>
					<td>${c.cashbookPrice}</td>
					<td>${c.cashbookContent}</td>
					<td><a href="">수정</a></td>
					<td><a href="">삭제</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>