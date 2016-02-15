/**
 * 
 */

var msg_writer = "작성자를 입력하세요.";
var msg_subject = "제목을 입력하세요.";
var msg_content = "내용을 입력하세요.";
var msg_password = "비밀번호를 입력하세요.";
var inserterror = "글 작성에 실패했습니다. \n잠시 후 다시 시도하세요!";
var passwderror = "입력하신 비밀번호가 다릅니다.\n다시 확인하세요.";
var deleteerror = "삭제에 실패하였습니다. \n잠시 후 다시 시도하세요!";
var deletereplyerror = "답글이 있습니다. \n삭제할 수 없습니다.";
var modifyerror = "글 수정에 실패하였습니다. \n잠시 후 다시 시도하세요!";

function erroralert(msg) {
	alert(msg)
}

function writefocus() {
	document.writeform.writer.focus();
}

function writecheck() {
	if (!document.writeform.writer.value) {
		alert(msg_writer);
		document.writeform.writer.focus();
		return false;
	} else if (!document.writeform.subject.value) {
		alert(msg_subject);
		document.writeform.subject.focus();
		return false;
	} else if (!document.writeform.content.value) {
		alert(msg_content);
		document.writeform.content.focus();
		return false;
	} else if (!document.writeform.passwd.value) {
		alert(msg_password);
		document.writeform.passwd.focus();
		return false;
	}
}

function passwdfocus() {
	document.passwdform.passwd.focus();
}

function passwdcheck() {
	if (!document.passwdform.passwd.value) {
		alert(msg_password);
		document.passwdform.passwd.focus();
		return false;
	}
}

function modifyfocus() {
	document.modifyform.subject.focus();
}

function modifycheck() {
	if (!document.modifyform.subject.value) {
		alert(msg_subject);
		document.modifyform.subject.focus();
		return false;
	} else if (!document.modifyform.content.value) {
		alert(msg_content);
		document.modifyform.content.focus();
		return false;
	} else if (!document.modifyform.passwd.value) {
		alert(msg_password);
		document.modifyform.passwd.focus();
		return false;
	}
}