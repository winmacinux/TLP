<jsp:include page="includes/header.jsp" />
<%@ page import="com.tlp.OverallPricing" %>
<%@ page import="java.lang.String" %>
<% OverallPricing pricing = (OverallPricing) request.getAttribute("overallPricing"); %>
<div class="row justify-content-md-center bg-primary text-white jumbotron mt-5 mb-0 rounded-0">
	<div class="col-sm-12 pb-5">
		<h2 class="display-4 text-center mb-3" >Result</h2>
	</div>
	<div class="col-sm-6">
		<h2 class="h1" ><%= pricing.getPerson().getName().toUpperCase() %></h2>
		<p class="lead" >Customer Name</p>	
	</div>
	<div class="col-sm-6" >
		<h2 class="h1" ><%= pricing.getPerson().getContact() %></h2>
		<p class="lead" >Contact Number</p>	
	</div>
	<div class="col-sm-6">
		<h2 class="h1" ><%= pricing.getPerson().getAge() %> Years</h2>
		<p class="lead" >Customer Age</p>	
	</div>
	<div class="col-sm-6" >
		<h2 class="h1" ><%= pricing.getPerson().getEmail() %></h2>
		<p class="lead" >Email Address</p>	
	</div>
	<div class="col-sm-12" >
		<h2 class="h1" ><%= pricing.getPerson().getPanCard().toUpperCase() %></h2>
		<p class="lead" >PAN Card</p>	
	</div>
</div>
<div class="row justify-content-md-center jumbotron rounded-0">
	<div class="col-sm-12 py-5">
		<h2 class="title text-center py-2" >
		Pricing Tier is set to: <span class="badge badge-primary py-2 px-5"><%= pricing.getStatus() %></span>
		</h2>
		<p class="lead" >Financial Stability: <span class="badge badge-success py-2 px-4"><%= pricing.getCustomerFinancialStability().toUpperCase() %></span></p>
		<p class="lead" >Property Risk: <span class="badge badge-success py-2 px-4"><%= pricing.getPropertyrisk().toUpperCase() %></span></p>
		<p class="lead" >Coverage Liability: <span class="badge badge-success py-2 px-4"><%= pricing.getCoverageLiability().toUpperCase() %></span></p>
	</div>
</div>		
<jsp:include page="includes/footer.jsp" />