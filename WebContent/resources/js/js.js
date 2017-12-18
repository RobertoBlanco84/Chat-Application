

setInterval("nextMessage()", 200);

function updateMessages(xhr, status, args) {
	if (!args.ok)
		return;
	$('#chat').append(
			'<div class="msg"><strong>'+args.user+'</strong>: '+args.text+'</div>');
	
	$('#chat').scrollTop($(document).outerHeight());
		
}


//Submitting the message and displays in chat area by pressing enter
$(document).ready(function(){
	$(document).on('keyup', pressed);
});

function pressed(e) {
	$('#editor').scrollTop(Number.MAX_SAFE_INTEGER);
	if(e.keyCode === 13){
		commandButton.click();
		timedClear();
	}
}

//Clear the previous message in text editor area after 500 ms
function timedClear(){
	setTimeout(clear, 500)
}

function clear(){
		PF('textEditor').clear();
}
