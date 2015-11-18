package bookstore.presentation;
import bookstore.service.*;
public class Guest implements Shopping, Login {
	
	final String id = "guest";
	final String pass = "guest";
	
	@Override
	public void buyBook() {
		// TODO 자동 생성된 메소드 스텁
		
	}

	@Override
	public void refundBook() {
		// TODO 자동 생성된 메소드 스텁
		
	}

	@Override
	public int login() {
		System.out.println("아이디를 입력하여 주십시오.");
		int input = Input.input();
		if () {
			
		}
		
	}



}
