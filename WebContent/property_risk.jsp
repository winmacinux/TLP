<%@ page import="com.tlp.PropertyRiskLogic" %>
<%@ page import="java.lang.String" %>
<%@ page import="com.tlp.Person" %>
<% Person person = (Person) session.getAttribute("person"); %>

<jsp:include page="includes/header.jsp" />

<div class="row justify-content-md-center jumbotron mt-5">
	<div class="col-sm-8 py-5">
		<h2 class="lead text-center mb-3" >Step-3</h2>
		<h3 class="display-4 text-center">Customer Property Risk</h3>
		<p class="lead" >Welcome <b><%= person.getName() %></b>, Fill the all Property Risk details to check the proper Insurance Credit.</p>
		
		<form action="" method="POST" class="needs-validation py-5" novalidate >
			<div class="form-group py-2">
				<label for="constructionType">Type of Construction</label> 
				<% 
					String[] typeOfProperties = (String[])PropertyRiskLogic.getTypeOfConstructionArr();
				%>			
				<select class="form-control" id="constructionType" name="constructionType" required >
					<% for(String property: typeOfProperties){ %>
						<option value="<%= property %>" ><%= property %></option>
					<% } %>
				</select>
				<div class="invalid-feedback">
			         Please Select Property Type
			       </div>
			</div>
			<div class="form-group">
				<label for="priorLosses">Prior Losses</label> <input type="number"
					class="form-control" id="priorLosses" name="priorLosses"
					placeholder="Enter Amount of Prior Losses Here" required >
					<div class="invalid-feedback">
			         Please Enter Total Amount of Prior Losses(In numbers only)
			       </div>
			</div>
			<div class="form-group">
				<label for="ageOfProperty">Property Age</label> <input type="number"
					class="form-control" id="ageOfProperty" name="ageOfProperty"
					placeholder="Enter Age of Property Here" required >
					<div class="invalid-feedback">
			         Please Enter the Property Age (In numbers only)
			       </div>
			</div>
			<div class="form-group">
				<label for="propertyValue">Property Value</label> <input
					type="number" class="form-control" id="propertyValue"
					name="propertyValue" placeholder="Enter Property Value Here" required >
					<div class="invalid-feedback">
			         Please Enter Total Property Value (In numbers only)
			       </div>
			</div>

			<button type="submit" class="btn btn-primary btn-block">Next</button>
		</form>
	</div>
</div>

<jsp:include page="includes/footer.jsp" />