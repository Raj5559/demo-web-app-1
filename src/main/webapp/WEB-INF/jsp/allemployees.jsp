<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>

<title>Employee Registration Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">

</head>


<body class="container">

	<h3>${title}</h3>
	<h6>${dt}</h6>
	<hr/>
	
	<c:if test="${employees!=null}">
		<table class="table table-bordered table-hover">
			<tr>
				<th>Employee ID</th>
				<th>Employee Name</th>
				<th>Employee City</th>
				<th>Employee Email</th>
				<th colspan="2"></th>
			</tr>
			<c:forEach items="${employees}" var="employee">
				<tr>
					<td class="text-primary">${employee.eid}</td>
					<td class="text-info">${employee.ename}</td>
					<td class="text-success">${employee.ecity}</td>
					<td class="text-danger">${employee.email}</td>
					<td><a href="" class="btn btn-primary">Edit</a></td>
					<td><a href="" class="btn btn-danger">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	
	
	

	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
		crossorigin="anonymous"></script>
		
		
		

</body>

</html>
