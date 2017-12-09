<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"  %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<sf:form method="post"

		action="${pageContext.request.contextPath}/insert" modelAttribute="Subject">


		<table class="formtable">

			<tr>

				<td class="label">Year</td>

				<td><sf:input class="control" type="text" path="year" value="2018" readonly="readonly" /> <br />

				<sf:errors class="error" path="year" /></td>

			</tr>

			<tr>

				<td class="label">Semester</td>

				<td><sf:input class="control" type="text" path="semester" value="1" readonly="readonly" /> <br />

				<sf:errors class="error" path="semester" /></td>

			</tr>

			<tr>

				<td class="label">Course_ID </td>

				<td><sf:input class="control" type="text" path="course_id" /> <br />

				<sf:errors class="error" path="course_id" /></td>

			</tr>

			<tr>

				<td class="label">name </td>

				<td>
				<form>
				<label><sf:radiobutton class="control" path="name" value="정보보안" />정보보안</label>

				<label><sf:radiobutton class="control" path="name" value="알프로그래밍" />알프로그래밍</label><br/>

				<label><sf:radiobutton class="control" path="name" value="설계디자인1" />설계디자인1</label>

				<label><sf:radiobutton class="control" path="name" value="설계디자인2" />설계디자인2</label><br/>

				<label><sf:radiobutton class="control" path="name" value="컴파일러" />컴파일러</label>

				<label><sf:radiobutton class="control" path="name" value="웹프레임워크3" />웹프레임워크3</label><br />

				<sf:errors class="error" path="name" /></form></td>

			</tr>

			<tr>

				<td class="label">Dividion </td>

				<td><sf:input class="control" type="text" path="division" /> <br />

				<sf:errors class="error" path="division" /></td>

			</tr>

			<tr>

				<td class="label">Grade </td>

				<td><sf:input class="control" type="text" value="3" path="grades" /> <br />

				<sf:errors class="error" path="grades" /></td>

			</tr>

			<tr>

				<td class="label"></td>

				<td><input class="control" type="submit" value="insert" /></td>

			</tr>

		</table>

	</sf:form>


</body>
</html>