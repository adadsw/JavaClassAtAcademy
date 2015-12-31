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
var inputerror = "회원가입에 실패하였습니다.\n 잠시 후 다시 시도하세요.";
var deleteerror = "회원탈퇴에 실패하였습니다.\n 잠시 후 다시 시도하세요.";
var passwderror = "입력하신 비밀번호가 다릅니다.\n 다시 확인하세요.";
var modifyerror = "회원정보수정에 실패하였습니다.\n 잠시 후 다시 시도하세요.";

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
function inputCheck(form) {
	if (!form.id.value) {
		alert(msg_id);
		form.id.focus();
		return false;
	} else if (!form.passwd.value) {
		alert(msg_passwd);
		form.passwd.focus();
		return false;
	} else if (form.passwd.value != form.repasswd.value) {
		alert(msg_repasswd);
		form.repasswd.focus();
		return false;
	} else if (!form.name.value) {
		alert(msg_name);
		form.name.focus();
		return false;
	} else if (form.jumin1.value.length != 6) {
		alert(msg_birth);
		form.jumin1.focus();
		return false;
	} else if (form.jumin2.value.length != 7) {
		alert(msg_birth);
		form.jumin2.focus();
		return false;
		//이메일이 직접입력일 경우 "@"가 포함되지 않으면 경고
	} else if (form.email1.value != "" && form.email2.value == "directInsert" && form.email1.value.indexOf("@") == -1) {
		alert(msg_email);
		form.email1.focus();
		return false;
	} else if (form.confirmid.value == 2) { //중복확인을 하지 않은 경우 경고.. 전제조건 : inputForm.jsp 안에 <input type="hidden" name="confirmid	" value="0">
		alert(msg_confirmid);
		form.id.focus();
		return false;
	}
}

function erroralert(msg) {
	alert(msg);
	window.history.back();
}

// 중복확인 페이지
function confirmId() {
	if(!document.inputform.id.value) {
		alert(msg_id);
		return false;
	}
	var url="confirmId.do?id=" + document.inputform.id.value;
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
function combineEmailTel(form) {
	if (form.tel1.value != "" && form.tel2.value != "" && form.tel3.value != "") {
		form.tel.value = form.tel1.value + "-" +  form.tel2.value + "-" + form.tel3.value;
	}
	if (form.email1.value != "") {
		if (form.email2.value == "directInsert") {
			form.email.value = form.email1.value;
		} else if (form.email2.value != "") {
			form.email.value = form.email1.value  + "@" + form.email2.value;
		} 
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

// 회원 탈퇴
function passwordfocus() {
	document.passwdform.passwd.focus();
}

function passwdCheck() {
	if (document.passwdform.passwd.value == "") {
		alert(msg_passwd);
		document.passwdform.passwd.focus();
		return false;
	}
}

// 수정 페이지 체크
function modifyCheck(form) {
	if (!form.passwd.value) {
		alert(msg_passwd);
		form.passwd.focus();
		return false;
	}
	if (form.passwd.value != form.repasswd.value) {
		alert(msg_repasswd);
		form.repasswd.focus();
		return false;
	} else if (form.email1.value == "") {
		if (form.email2.value != "") {
			alert(msg_email);
			return false;
		}
	} else if (form.email2.value == "") {
		if (form.email1.value != "") {
			alert(msg_email);
			return false;
		}
	}
}

function modifyFocus() {
	document.modifyform.passwd.focus();
}