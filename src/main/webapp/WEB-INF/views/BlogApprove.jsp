<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<title>Insert title here</title>
<style type="text/css">
#bd {
	margin-top: 100px;
}
</style>
</head>

<body>
	<%@include file="Header1.jsp"%>
	<div class="container-fluid" id="fullwrapper">
		<div class="rows">
			<!-- 			<div class="col-md-3"> -->
			<%-- 				<%@include file="sidebar.jsp"%> --%>
			<!-- 			</div> -->

			<div style="margin-top: 150px">
				<form:form method="POST" action="updateBlog" modelAttribute="blog">
					<table class="table table-bordered" align="center"
						style="width: 90%">
						<tr>
							<td><form:label path="blogid">Blog ID : </form:label></td>
							<td><form:input path="blogid" value="${blog.blogid}"
									readonly="true" class="form-control" type="text"
									readOnly="true" /></td>
						</tr>
						<tr>
							<td><form:label path="blogtitle">Blog Title : </form:label></td>
							<td><form:input path="blogtitle" value="${blog.blogtitle}"
									class="form-control" /></td>
						</tr>
						<tr>
							<td><form:label path="blogdesc">Movie Actor:</form:label></td>
							<td><form:input path="blogdesc" value="${blog.blogdesc}"
									class="form-control" /></td>
						</tr>

						<tr>
							<td colspan="2"><input type="submit" value="Approve" /></td>
						</tr>
					</table>
				</form:form>
			</div>
		</div>
	</div>
	<%@include file="Footer.jsp"%>
</body>
</html>