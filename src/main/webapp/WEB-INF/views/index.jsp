<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<%@include file="Header1.jsp"%>
	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">
				<ul class="nav nav-pills nav-stacked">
					<li><a href="Profile">Profile</a></li>
					<li><a href="Blogs">Blogs</a></li>
					<li><a href="Forum">Discussion Forum</a></li>
				</ul>
				<br>
			</div>
			<div class="col-sm-8">
				<h1>Welcome</h1>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
					do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
					enim ad minim veniam, quis nostrud exercitation ullamco laboris
					nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat
					cupidatat non proident, sunt in culpa qui officia deserunt mollit
					anim id est laborum consectetur adipiscing elit, sed do eiusmod
					tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
					minim veniam, quis nostrud exercitation ullamco laboris nisi ut
					aliquip ex ea commodo consequat.</p>
				<hr>
				<h3>Test</h3>
				<p>Lorem ipsum...</p>
			</div>
			<div class="col-sm-2 sidenav">
				<div class="well">
					<h4>NIIT Launches DigiNext</h4>
					<div class="embed-responsive embed-responsive-4by3">
						<iframe width="854" height="480" src="https://www.youtube.com/embed/fIXEHKYeujY" 
						frameborder="0" allowfullscreen></iframe>
					</div>
				</div>
				<div class="well">
					<h4>Animesh Kuman-GNIITian</h4>
					<div class="embed-responsive embed-responsive-4by3">
						<iframe width="854" height="480" src="https://www.youtube.com/embed/pOIeVCMMADo" 
						frameborder="0" allowfullscreen></iframe>
					</div>
				</div>
				<div class="well">
					<h4>NIIT IFBI MADURAI 3</h4>
					<div class="embed-responsive embed-responsive-4by3">
						<iframe width="854" height="480" src="https://www.youtube.com/embed/pzZl7je8zYY"
						 frameborder="0" allowfullscreen></iframe>
					</div>
				</div>
			</div>
		</div>
	</div>
		<%@include file="Footer.jsp"%>	
</body>
</html>