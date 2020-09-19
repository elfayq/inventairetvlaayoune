/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(fonction, status){
			$('#txtIdEdit').val(fonction.id);
			$('#txtNameEdit').val(fonction.fonction_name);
			$('#ddlServiceEdit').val(fonction.serviceid);
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