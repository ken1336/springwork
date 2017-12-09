<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<p>

		<a href="${pageContext.request.contextPath}/semester">학년/학기별
			이수 학점 조회</a>

	</p>

	<p>

		<a href="${pageContext.request.contextPath}/division">이수
			구분별 학점 조회</a>

	</p>

	<p>

		<a href="${pageContext.request.contextPath}/enrolment">수강 신청하기</a>

	</p>

	<p>

		<a
			href="${pageContext.request.contextPath}/show_enrolment?year=2018&semester=1">수강
			신청 조회 메뉴</a>

	</p>


	<P>The time on the server is ${serverTime}.</P>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<a href="javascript:document.getElementById('logout').submit()">Logout</a>
	</c:if>

	<form id="logout" action="<c:url value="/logout" />" method="post">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>


</body>
</html>