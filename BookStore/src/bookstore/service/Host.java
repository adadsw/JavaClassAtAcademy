package bookstore.service;

public interface Host {
	public static final String ID = "host";	//아이디 인증을 위한 상수값
	public static final String PASS = "host";
	
	abstract int listBook();	//책 목록
	abstract int addBook();	//책 추가
	abstract int modifyBook();	//책 수정
	abstract int deleteBook();	//책 삭제
	
	abstract int listOrder();	//주문 목록
//	abstract int addOrder();
//	abstract int deleteOrder();
	
	abstract void hostLogin();	//host.state를 HOST_LOGIN으로 변경하는 메서드
	abstract void hostLogout();	//host.state를 HOST_LOGOUT으로 변경하는 메서드

}
