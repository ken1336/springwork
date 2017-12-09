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

	<table>

		<thead>

			<tr>

				<c:forEach var="subject" items="${subjects}">

					<th><c:out value="${subject.division}"></c:out></th>

				</c:forEach>

			</tr>

		</thead>

		<tbody>

			<tr>

				<c:forEach var="subject" items="${subjects}">

					<td><c:out value="${subject.grades}"></c:out></td>

				</c:forEach>

			</tr>

		</tbody>



	</table>

</body>
</html>