<jsp:include page="includes/header.jsp" />
<div class="row justify-content-md-center jumbotron mt-5">
	<div class="col-sm-8 py-5">
		<h2 class="lead text-center mb-3" >Step-1</h2>
		<h3 class="display-4 text-center">Enter Customer Basic Details</h3>
		<form action="" method="POST" class="needs-validation py-5" novalidate >
			<div class="form-group py-2">
				<label for="name">Customer Name</label> <input type="text"
					class="form-control" id="name" name="name"
					placeholder="Enter Customer Name Here" required >
					<div class="invalid-feedback">
			         Please Enter Customer's Name.
			       </div>
			</div>
			<div class="form-group">
				<label for="age">Customer Age</label> <input type="number"
					class="form-control" id="age" name="age"
					placeholder="Enter Customer Age Here" required >
					<div class="invalid-feedback">
			         Please Enter Age(In Numbers only).
			       </div>
			</div>
			<div class="form-group">
				<label for="email">Email Address</label> <input
					type="email" class="form-control" id="email"
					name="email" placeholder="Enter Email Address Here" required >
					<div class="invalid-feedback">
			         Please Enter Email Here
			       </div>
			</div>
			<div class="form-group">
				<label for="contact">Contact Number</label> <input
					type="text" class="form-control" id="contact"
					name="contact" placeholder="Enter Contact Number Here" required >
					<div class="invalid-feedback">
			         Please Enter Contact Number(In numbers only)
			       </div>
			</div>
			<div class="form-group">
				<label for="panCard">Pan Card Number</label> <input
					type="text" class="form-control" id="panCard"
					name="panCard" placeholder="Enter Pan Card Number Here" required >
					<div class="invalid-feedback">
			         Please Enter Pan Card Number
			       </div>
			</div>

			<button type="submit" class="btn btn-primary btn-block">Next</button>
		</form>
	</div>
</div>
<jsp:include page="includes/footer.jsp" />