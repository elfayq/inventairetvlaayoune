/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(employer, status){
			$('#txtIdEdit').val(employer.id);
			$('#txtFNameEdit').val(employer.employer_fname);
			$('#txtLastNameEdit').val(employer.employer_lname);
			$('#txtPhoneEdit').val(employer.employer_phone);
			$('#txtEmailEdit').val(employer.employer_email);
			$('#ddlCityEdit').val(employer.cityid);
			$('#ddlStateEdit').val(employer.stateid);
		});			
		$('#editModal').modal();		
	});
	
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #confirmDelete').attr('href', href);
		$('#deleteModal').modal();		
	});	
	

});