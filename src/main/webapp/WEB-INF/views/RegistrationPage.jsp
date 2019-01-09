<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title}</title>
<link rel="shortcut icon" 	href="<c:url value='/static/images/logo/ss-icon.png' />" type="image/x-icon" />
<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
<link href="<c:url value='/static/css/FieldStyle.css' />" rel="stylesheet"></link>
<script src="<c:url value='/static/js/bootstrap.min.js' />"></script>
<script src="<c:url value='/static/js/jquery-3.2.1.slim.min.js' />"></script>
<script src="<c:url value='/static/js/popper.min.js' />"></script>
<script src="<c:url value='/static/js/data-time.js' />"></script>
</head>
<body>
	<div id="container">
		<div id="header-container" style="background-color:aqua">
			<span class="logo"> 
				<img src="<c:url value='/static/images/logo/sasha-logo.png' />" alt="sasha" width="300" height="70">
			</span>
			<span class="title">${message}</span>
			<span id="data_time"></span>
			<script type="text/javascript">
				window.onload = date_time('data_time');
			</script>
		</div>
		
		<div id="body-form">
		
			<form:form action="addStaff" method="post" commandName="user" class ="registrationForm">
			
				<h2 class="user">Staff Registration</h2>
				
				<div class="column largebuffer"></div>
				
				<h4 class="user_info">User Information</h4>
				
				<div class="column twoColumn">

					<div class="input">
						<label for="name">Name</label> 
						<form:input type="text" name="name" placeholder="Enter Name" path="name" />
					</div>
					
					<div class="input">
						<label for="doj">Date Of Joining(DD/MM/YYYY)</label> 
						<form:input type="text" name="doj" placeholder="DD/MM/YYYY" path="doj" />
					</div>
					
					<div class="input">
						<label for="msisdn">Mobile Number</label> 
						<form:input type="text" name="msisdn" placeholder="Enter Mobile Number" path="msisdn" />
					</div>
				</div>
				
				<div class="column twoColumn">

					<div class="input">
						<label for="userName">Login User Name</label> 
						<form:input type="text" name="userName" placeholder="Enter Login User Name" path="userName" />
					</div>

					<div class="input">
						<label for="password">Password</label> 
						<form:input type="password" name="password" placeholder="Enter Password" path="password" />
					</div>

				</div>
				 
				<div class="column buffer"></div>
				
				<h4 class="address_info">Address Information</h4>
				
				<div class="column twoColumn">

					<div class="input">
						<label for="address.houseNumber">House Number</label> 
						<form:input type="text" name="address.houseNumber" placeholder="Enter House Number" path="address.houseNumber" />
					</div>

					<div class="input">
						<label for="address.city">City</label> 
						<form:input type="text" name="address.city" placeholder="Enter City" path="address.city" />
					</div>
					
					<div class="input">
						<label for="address.country">Country</label> 
						<form:input type="text" name="address.country" placeholder="Enter Country" path="address.country" />
					</div>

				</div>
				
				<div class="column twoColumn">

					<div class="input">
						<label for="address.street">Street</label>
						<form:input type="text" name="address.street" placeholder="Enter Street" path="address.street" />
					</div>

					<div class="input">
						<label for="address.state">State</label> 
						<form:input type="text" name="address.state" placeholder="Enter State" path="address.state" />
					</div>

				</div>
				
				<div class="column buffer"></div>
				
				<h4 class="roles_info">Roles</h4>

				<div class="column twoColumn">
					<div class="input">
							<form:checkboxes path="roleList" items="${roleMap}"/>
					</div>
				</div>
				<div class="column largebuffer"></div>
				
				<input class="submit" type="submit" value="Register" />
			
			</form:form>
		</div>
		
		<div id="footer-container">
				<span>&copy; Sasha Technologies &trade; 2018</span>
		</div>	
	
	</div>
</body>
</html>
