/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-primary').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(equipement, status){
			$('#txtIdEdit').val(equipement.id);
			$('#txtEquipementNameEdit').val(equipement.equipNom);
			$('#ddlEquipementMakeEdit').val(equipement.equipementmakeid);
			$('#txtEquipementReferenceEdit').val(equipement.equipReference);
			$('#txtEquipementNumSerieEdit').val(equipement.equipNumSerie);
			$('#txtEquipementInventaireEdit').val(equipement.equipInventaire);
			
			var affectDate = equipement.DateAffectLaayoune.substr(0,10);
			$('#txtDateAffectLaayouneEdit').val(affectDate);
			
			
			$('#txtobservationEdit').val(equipement.observation);
			$('#ddlEquipementTypeEdit').val(equipement.equipementypetid);
			
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