/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(state, status){
			$('#txtIdEdit').val(state.id);
			$('#txtStateNameEdit').val(state.state_name);
			$('#ddlCityEdit').val(state.cityid);
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