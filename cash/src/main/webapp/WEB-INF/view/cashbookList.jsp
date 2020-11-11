<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>casbookList</title>
</head>
<body>
	<jsp:include page="/WEB-INF/view/inc/menu.jsp"></jsp:include>
	<h1>cashbookList</h1>
	<a href="/admin/cashbookListExcel">[전체 cashbook 리스트를 엑셀 파일로 다운]</a>
	<table border="1">
		<thead>
			<tr>
				<th>cashbook_id</th>
				<th>cashbook_kind</th>
				<th>cashbook_name</th>
				<th>cashbook_price</th>
				<th>cashbook_content</th>
				<th>cashbook_date</th>
				<th>create_date</th>
				<th>update_date</th>
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
					<td>${c.cashbookDate}</td>
					<td>${c.createDate}</td>
					<td>${c.updateDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<a href="">[이전]</a>
		<a href="">[다음]</a>
	</div>
</body>
</html>