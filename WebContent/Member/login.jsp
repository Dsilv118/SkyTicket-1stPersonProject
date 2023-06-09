<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="conPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="${conPath }/css/login.css" rel="stylesheet" type="text/css">
</head>
<body>
	<c:set var="SUCCESS" value="1"/>
	<c:set var="FAIL" value="0"/>
	<c:if test="${joinResult eq SUCCESS}">
		<script>alert('회원가입되었습니다. 감사합니다')</script>
	</c:if>
	<c:if test="${joinResult eq FAIL}">
		<script>
			alert('회원가입 실패되었습니다. 다시 확인해주세요');
			location.href = '${conPath }/joinView.do';
		</script>
	</c:if>
	<jsp:include page="../Main/header.jsp"/>
	<div id="login_form">
		<form action="login.do" method="post">
			<table>
				<caption>로그인</caption>
				<tr>
					<td>
						<input type="text" name="mid" id="mid" required="required" autofocus="autofocus" value="${mid }" placeholder="아이디">
					</td>
				</tr>
				<tr>
					<td>
						<input type="password" name="mpw" id="mpw" required="required" placeholder="비밀번호">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="로그인" class="btn">
					</td>
				</tr>
			</table>
			<p><a href="joinView.do">회원가입</a>&nbsp; <span class="light">I</span> &nbsp;<a href="adminLoginView.do">관리자모드</a></p>
		</form>
	</div>
	<jsp:include page="../Main/footer.jsp"/>
</body>
</html>