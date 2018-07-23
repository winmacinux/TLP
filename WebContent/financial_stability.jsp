<jsp:include page="includes/header.jsp" />
<%@ page import="com.tlp.Person" %>
<% Person person = (Person) session.getAttribute("person"); %>

<div class="row justify-content-md-center jumbotron mt-5">
	<div class="col-sm-8 py-5">
		<h2 class="lead text-center mb-3" >Step-2</h2>
		<h3 class="display-4 text-center">Customer Financial Details</h3>
		<p class="lead" >Welcome <b><%= person.getName() %></b>, Fill the all Financial Stability details to check the proper Insurance Credit.</p>
		<form action="" method="POST" class="needs-validation py-5" novalidate >
			<div class="form-group py-2">
				<label for="yearsInBusiness">Years In Business</label> <input type="number"
					class="form-control" id="yearsInBusiness" name="yearsInBusiness"
					placeholder="Enter total years in business" required >
					<div class="invalid-feedback">
			         Please Enter Total Years in Business(In numbers only)
			       </div>
			</div>
			<div class="form-group">
				<label for="numberOfBankruptcies">Number Of Bankruptcies</label> <input type="number"
					class="form-control" id="numberOfBankruptcies" name="numberOfBankruptcies"
					placeholder="Enter total bankruptices here" required >
					<div class="invalid-feedback">
			         Please Enter Total Numbers of Bankruptcies(In numbers only)
			       </div>
			</div>
			<div class="form-group">
				<label for="yearsAtCurrentAddress">Years At Current Address</label> <input
					type="number" class="form-control" id="yearsAtCurrentAddress"
					name="yearsAtCurrentAddress" placeholder="Enter years at current address here" required >
					<div class="invalid-feedback">
			         Please Enter Total Years at Current Address(In numbers only)
			       </div>
			</div>

			<button type="submit" class="btn btn-primary btn-block">Next</button>
		</form>
	</div>
</div>
<jsp:include page="includes/footer.jsp" />