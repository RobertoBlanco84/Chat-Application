
setInterval("nextMessage()", 200);

function updateMessages(xhr, status, args) {
	if (!args.ok)
		return;
	$('#chat').append(
			'<div class="msg">[' + args.dateSent + '] <strong>' + args.user
			+ '</strong>: ' + args.text + '</div>');
}

/*function clearOnEnter(){
	
	if (event.keyCode == 13) { 
	PF('textEditor').clear();
	return false;
	}
}*/