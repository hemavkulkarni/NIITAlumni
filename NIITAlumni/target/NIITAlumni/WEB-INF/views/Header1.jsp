]<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c1"%>
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}

/* Set gray background color and 100% height */
.sidenav {
	padding-top: 20px;
	background-color: #f1f1f1;
	height: 100%;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index">
				<li><img src="resources/images/NIITAlumni.png"
					class="img-circle" height="50" width="70" alt="Avatar"></li>
			</a>			
		</div>

		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav navbar-left">
				<c1:if test="${pageContext.request.userPrincipal.name != null}">
					<c1:if
						test="${pageContext.request.userPrincipal.name != 'meghkul'}">
						<li><a href="MyProfile">PROFILE</a></li>
						<li><a href="JoinUs">JOIN US</a></li>
						<li><a href="GetInfo">GET INFO</a></li>
						<li><a href="Engage">ENGAGE</a></li>
						<li><a href="Benefits">BENEFITS</a></li>
						<li><a href="Forum">DISCUSSION FORUM</a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">BLOG <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="BlogAdd">ADD NEW BLOG</a></li>
								<li><a href="BlogView">VIEW ALL BLOG</a></li>
							</ul></li>
					</c1:if>
					<c1:if
						test="${pageContext.request.userPrincipal.name == 'meghkul'}">
						<!-- <li><img src="resources/images/NIITAlumni.png"
							class="img-circle" height="50" width="70" alt="Avatar"></li> -->
						<li><a href="MyProfile">PROFILE</a></li>
						<li><a href="JoinUs">JOIN US</a></li>
						<li><a href="GetInfo">GET INFO</a></li>
						<li><a href="Engage">ENGAGE</a></li>
						<li><a href="Benefits">BENEFITS</a></li>
						<li><a href="Forum">DISCUSSION FORUM</a></li>
						<li><a href="Chat">CHAT</a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">BLOG <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="<c1:url value='/BlogAdd'/>">ADD BLOG</a></li>
								<li><a href="<c1:url value='/BlogView'/>">VIEW ALL BLOG</a></li>
								<li><a href="<c1:url value='/admin/blogViewApprove'/>">APPROVE
										BLOG</a></li>
							</ul></li>
					</c1:if>
				</c1:if>
			</ul>
			<c1:if test="${pageContext.request.userPrincipal.name != null}">
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#"> <span class="username">${pageContext.request.userPrincipal.name}</span>
							<b class="caret"></b>
					</a>
						<ul class="dropdown-menu extended logout">
							<!-- <div class="log-arrow-up"></div> -->
							<li><img src="resources/images/NIITAlumni.png"
								class="img-circle" height="50" width="70" alt="Avatar"></li>
							<li class="eborder-top"><a href="Home">My Profile</a></li>
							<li class="divider"></li>
							<li class="divider"></li>
							<li><a href="<c1:url value='/Logout'/>"><i
									class="icon_key_alt"></i> Logout</a></li>
						</ul></li>
				</ul>
			</c1:if>
			<ul class="nav navbar-nav navbar-right">
				<c1:if test="${pageContext.request.userPrincipal.name  == null}">

					<li><a href="Login">LOGIN</a></li>
					<%--   		<li><a href="<c1:url value='/personadd'/>">REGISTER</a></li> --%>
				</c1:if>
			</ul>
		</div>
	</div>
	</nav>
</body>
</html>