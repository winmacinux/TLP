<%@ page import="com.tlp.CoveragestabilityLogic" %>
<%@ page import="java.lang.String" %>
<%@ page import="com.tlp.Person" %>
<% Person person = (Person) session.getAttribute("person"); %>

<jsp:include page="includes/header.jsp" />

<div class="row justify-content-md-center jumbotron mt-5">
	<div class="col-sm-8 py-5">
		<h2 class="lead text-center mb-3" >Step-4</h2>
		<h3 class="display-4 text-center">Customer Coverage Liability</h3>
		<p class="lead" >Welcome <b><%= person.getName() %></b>, Fill the all Coverage Liability details to check the proper Insurance Credit.</p>
		
		<% 
			String[] industryArr = (String[])CoveragestabilityLogic.getIndustryarr();
			String[] coverageArr = (String[])CoveragestabilityLogic.getCoveragearr();
		%>			
		<form action="" method="POST" class="needs-validation py-5" novalidate >
			<div class="form-group pt-2">
				<label for="coverage">Type of Coverage</label> 
				<select class="form-control" id="coverage" name="coverage" required >
					<% for(String coverage: coverageArr){ %>
						<option value="<%= coverage %>" ><%= coverage %></option>
					<% } %>
				</select>
				<div class="invalid-feedback">
			         Please Select Industry Type
			       </div>
			</div>
			<div class="form-group">
				<label for="industry">Type of Industry</label> 
				<select class="form-control" id="industry" name="industry" required >
					<% for(String industry: industryArr){ %>
						<option value="<%= industry %>" ><%= industry %></option>
					<% } %>
				</select>
				<div class="invalid-feedback">
			         Please Select Industry Type
			       </div>
			</div>

			<button type="submit" class="btn btn-primary btn-block">Next</button>
		</form>
	</div>
</div>

<jsp:include page="includes/footer.jsp" />