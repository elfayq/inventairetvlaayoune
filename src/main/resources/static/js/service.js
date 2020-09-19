/**
 * 
 */

$('document').ready(function() {
	
	$('.table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(seervice, status){
			$('#txtIdEdit').val(seervice.id);
			$('#txtNameEdit').val(seervice.service_name);
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