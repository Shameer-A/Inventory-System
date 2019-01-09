<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
<%-- <link href="<c:url value='/static/css/bootstrap.min.css' />" rel="stylesheet"></link> --%>
<link rel="shortcut icon"
	href="<c:url value='/static/images/logo/ss-icon.png' />"
	type="image/x-icon" />
<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
<link href="<c:url value='/static/css/FieldStyle.css' />" rel="stylesheet"></link>
<%-- <script src="<c:url value='/static/js/bootstrap.min.js' />"></script>
<script src="<c:url value='/static/js/jquery-3.2.1.slim.min.js' />"></script>
<script src="<c:url value='/static/js/popper.min.js' />"></script> --%>
<script src="<c:url value='/static/js/data-time.js' />"></script>
</head>
<body>
	<div id="login-page">
		<div id="container">
			<div id="header-container">
				<span class="logo"> <img
					src="<c:url value='/static/images/logo/sasha-logo.png' />"
					alt="sasha" width="300" height="70">
				</span> <span class="title">${message}</span> <span id="data_time"></span>
				<script type="text/javascript">window.onload = date_time('data_time');</script>
			</div>


			<div id="body-container">

				<span class="body-left">Wether Report</span>

					<span class="body-right"> <!-- Login Form  -->

						<form action="login" method="post" class="loginForm">

							<h2 class="security">Login</h2>

							<div class="column buffer"></div>

							<div class="column">
							
								<div class="input">
									<label for="userName">User Name</label>
									<input type="text" name="userName" placeholder="User Name" required />
								</div>

								<div class="input">
									<label for="password">Password</label>
									<input type="password" name="password" placeholder="Password" required />
								</div>


								<div class="column largebuffer"></div>
								<input class="submit" type="submit" value="Login" />
							</div>

						</form>
						<div class="column largebuffer"></div>
						
						<a href="register">Register!</a>
					</span>
			</div>

			<div id="footer-container">
				<span>&copy; Sasha Technologies &trade; 2018</span>
			</div>

		</div>
	</div>

</body>
</html>