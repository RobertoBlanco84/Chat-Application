

setInterval("nextMessage()", 200);

function updateMessages(xhr, status, args) {
	if (!args.ok)
		return;
	$('#chat').append(
			'<div class="msg">[' + args.dateSent + '] <strong>' + args.user
			+ '</strong>: ' + args.text + '</div>');
}


$(document).ready(function(){
	$(document).bind('keypress',pressed);
});

function pressed(e)
{
	if(e.keyCode === 13){
		commandButton.click();
		// PF('textEditor').clear();	
	}
}
/*
$(document).ready(function() {
	window.ClearOnEnter = function() {
		if (event.keyCode == 13) { 
			PF('textEditor').clear();
			return false;
		}
		else{
			return true;
		}
	}
});*/











