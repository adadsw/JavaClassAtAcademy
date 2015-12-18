/**
 * 
 */

var msg_id = "아이디를 입력하세요";
var msg_passwd = "비밀번호를 입력하세요";
var msg_repasswd= "비밀번호가 다릅니다.";
var msg_name = "이름을 입력하세요.";
var msg_birth = "주민번호를 입력하세요.";
var msg_email = "이메일 형식에 맞지 않습니다.";
var msg_confirmid = "중복확인을 해주세요.";

// 메인 페이지
function mainfocus() {
	document.mainform.id.focus();
}

function maincheck() {
	if(!document.mainform.id.value) {
		alert(msg_id);
		document.mainform.id.focus();
		return false;
	} else if(!document.mainform.passwd.value) {
		alert(msg_passwd);
		document.mainform.passwd.focus();
		return false;
	}
}

// 회원가입 페이지
function inputfocus() {
	document.inputform.id.focus();
}
function inputCheck() {
	if (!document.inputform.id.value) {
		alert(msg_id);
		document.inputform.id.focus();
		return false;
	} else if (!document.inputform.passwd.value) {
		alert(msg_passwd);
		document.inputform.passwd.focus();
		return false;
	} else if (document.inputform.passwd.value != document.inputform.repasswd.value) {
		alert(msg_repasswd);
		document.inputform.repasswd.focus();
		return false;
	} else if (!document.inputform.name.value) {
		alert(msg_name);
		document.inputform.name.focus();
		return false;
	} else if (!document.inputform.jumin1.value) {
		alert(msg_birth);
		document.inputform.jumin1.focus();
		return false;
		//이메일이 직접입력일 경우 "@"가 포함되지 않으면 경고
	} else if (document.inputform.email2.value == 0 && document.inputform.email1.value.indexOf("@") == -1) {
		alert(msg_email);
		document.inputform.email1.focus();
		return false;
	} else if(document.inputform.confirmid.value == 0) { //중복확인을 하지 않은 경우 경고.. 전제조건 : inputForm.jsp 안에 <input type="hidden" name="confirmid	" value="0">
		alert(msg_confirmid);
		document.inputform.id.focus();
		return false;
	}
}
// 중복확인 페이지
function confirmId() {
	if(!document.inputform.id.value) {
		alert(msg_id);
		return false;
	}
	var url="confirmId.jsp?id=" + document.inputform.id.value;
	window.open(url, "confirm", "manubar=no, width=300, height=200");
}
function nextjumin1() {
	if(document.inputform.jumin1.value.length >= 6) {
		document.inputform.jumin2.focus();
	}
}
function nextjumin2() {
	if(document.inputform.jumin2.value.length >= 7) {
		document.inputform.tel1.focus();
	}
}
function nexttel1() {
	if(document.inputform.tel1.value.length >= 3) {
		document.inputform.tel2.focus();
	}
}
function nexttel2() {
	if(document.inputform.tel2.value.length >= 4) {
		document.inputform.tel3.focus();
	}
}
function nexttel3() {
	if(document.inputform.tel3.value.length >= 4) {
		document.inputform.email1.focus();
	}
}
function confirmCheck() {
	if (!document.fonfirmForm.id.value) {
		alert(msg_id);
		document.confirmForm.id.focus();
		return false;
	}
}
function confirmFocus() {
	document.confirmForm.id.focus();
}

function setId(id) {
	opener.document.inputform.id.value = id;
	opener.document.inputform.confirmid.value = 1;
	self.close();
}
