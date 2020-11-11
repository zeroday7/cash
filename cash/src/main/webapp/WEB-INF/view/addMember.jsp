<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addMember</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$('#id').focus();

	
	$('#id').blur(function(){
		// 비동기요청으로 #id값을 서버에 보내고 #id값이 중복인지 아닌지....
		if($('#id').val() == '') {
			$('#id').focus();
			return;
		}
		$.ajax({
			url:'/admin/idCheck',
			type:'post',
			data:{id:$('#id').val()},
			success:function(data) { // data -> "yes":사용가능한ID, "no":사용불가ID
				if(data == 'yes') {
					alert($('#id').val()+'는 사용가능한 ID입니다');
					$('#pw').focus();
				} else {
					alert($('#id').val()+'는 사용중인 ID입니다');
					$('#id').select();
					$('#id').focus();
				}
			}
		});
	});
});
</script>
</head>
<body>
	<!-- 2. -->
	<jsp:include page="/WEB-INF/view/inc/menu.jsp"></jsp:include>
	<h1>addMember</h1>
	<form method="post" action="/admin/addMember"><!-- 3. -->
		<div>
			ID : <input type="text" id="id" name="id">
		</div>
		<div>
			PW : <input type="password" id="pw" name="pw">
		</div>
		<div><button type="submit" id="addMember">addMember</button></div>
	</form>
</body>
</html>