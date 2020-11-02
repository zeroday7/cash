<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	.sunday {color : #FF0000;}
</style>
</head>
<body>
	<h1>index</h1>
	<h3>��������</h3>
	<table border="1">
		<thead>
			<tr>
				<th>notice_id</th>
				<th>notice_title</th>
				<th>notice_date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="notice" items="${list}">
				<tr>
					<td>${notice.noticeId}</td>
					<td>${notice.noticeTitle}</td>
					<td>${notice.noticeDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<!-- ���̾ -->
	<h3>
		<a href="/index?currentYear=${year}&currentMonth=${month-1}">[������]</a>
		${year}�� ${month} ��
		<a href="/index?currentYear=${year}&currentMonth=${month+1}">[������]</a>
	</h3>
	
	<div>
		<table border="1" width="100%">
			<thead>
				<tr>
					<th>��</th>
					<th>��</th>
					<th>ȭ</th>
					<th>��</th>
					<th>��</th>
					<th>��</th>
					<th>��</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<c:forEach var="i" begin="1" end="${lastDay+(firstDayOfWeek-1)}" step="1">
						<c:if test="${i-(firstDayOfWeek-1) < 1}">
							<td>&nbsp;</td>
						</c:if>
						<c:if test="${i-(firstDayOfWeek-1) > 0}">
							<c:if test="${i%7 == 1}">
								<td class="sunday">${i-(firstDayOfWeek-1)}</td>
							</c:if>
							<c:if test="${i%7 !=1 }">
								<td>${i-(firstDayOfWeek-1)}</td>
							</c:if>
						</c:if>
						<c:if test="${i%7 == 0}">
							</tr><tr>
						</c:if>
					</c:forEach>
					
					<c:if test="${(lastDay+(firstDayOfWeek-1)) % 7 != 0}">
						<c:forEach begin="1" end="${7- ((lastDay+(firstDayOfWeek-1)) % 7)}" step="1">
							<td>&nbsp;</td>
						</c:forEach>
					</c:if>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>