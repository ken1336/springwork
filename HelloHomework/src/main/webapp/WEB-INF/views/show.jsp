<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>

		<thead>

			<tr>

				<th>년도</th>

				<th>학기</th>

				<th>과목코드</th>

				<th>과목이름</th>

				<th>구분</th>

				<th>학점</th>	

			</tr>

		</thead>

		<tbody>

			<c:forEach var="subject" items="${subjects}">

				<tr class="table_hover">

					<td><c:out value="${subject.year}"></c:out></td>

					<td><c:out value="${subject.semester}"></c:out></td>

					<td><c:out value="${subject.course_id}"></c:out></td>

					<td><c:out value="${subject.name}"></c:out></td>															

					<td><c:out value="${subject.division}"></c:out></td>

					<td><c:out value="${subject.grades}"></c:out></td>

				</tr>

			</c:forEach>

		</tbody>

	</table>

</body>
</html>