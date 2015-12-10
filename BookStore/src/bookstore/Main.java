/*
 * 서점에서, 주인을 위한 주문관리, 재고관리 기능과 손님을 위한 구매, 환불 기능이 있는 프로그램입니다.
 * 
 * bookstore.Main	..Main. switch/case문으로 각 메뉴를 연결
 * 					변수 code를 통해 메인->기능
 * 					기능에서 또 다른 기능의 code 값을 리턴하여 다음 기능으로 연결
 * 
 * 각 패키지에 포함된 클래스 간략 설명
 * bookstore.domain.Book	..책 객체 
 * bookstore.domain.CODE	..SHOP_LOGIN, HOST_BOOK 등의 각 상수값
 * bookstore.domain.Order	..Guest가 buy()한 책을 저장할 ArrayList<Book>
 * bookstore.domain.Shelf	..Host가 addBook()한 책을 저장할 HashMap<Integer, Book>
 * 							  이걸로 책 목록, 추가, 수정, 삭제 구현
 * 
 * bookstore.presentation.Console	..값 입력 메서드만 구현
 * bookstore.presentation.Menu		..메뉴 기능 정의서
 * bookstore.presentation.MenuImplement	..login, host, guest의 메뉴를 구현
 * 
 * bookstore.service.Guest ..기능 정의
 * bookstore.service.GuestImplement	.. 구매, 환불
 * bookstore.service.Host ..기능 정의
 * bookstore.service.HostImplement	..책 추가, 삭제, 수정, 목록. 그리고 주문 목록.
 * bookstore.service.Shop	..샵 오픈 시 메시지. 1, 2선택에 따른 주인, 손님 로그인 method 호출
 * 
 */

package bookstore;

import static bookstore.domain.CODE.*;

import bookstore.presentation.*;
import bookstore.service.*;

public class Main {
	public static void main(String[] args) {
		int code = SHOP_LOGIN;
		
		// 각 객체는 Singtone으로 한 번만 만들어지고 각 클래스의 getInstance()로 호출
		Menu menu = MenuImplement.getInstance();
		HostImplement host = HostImplement.getInstance();
		GuestImplement guest = GuestImplement.getInstance();
		Shop shop = Shop.getInstance();

		System.out.println("서점 문을 엽니다.");
		while (true) {
			switch (code) {	
			case SHOP_LOGIN:	//code의 초기값 = SHOP_LOGIN으로 프로그램 실행 시 첫 case
				code = shop.selectUser();	//Shop 클래스의 주인, 손님 선택
				break;
			case HOST: // 주인 메뉴
				switch (host.state) { // host.state는 주인의 로그인, 로그아웃 상태
				case HOST_LOGIN:
					code = menu.hostMenu();
					break;
				case HOST_LOGOUT:	//Shop 클래스에서 주인 선택 시 host의 state는 HOST_LOGOUT이 초기값임 
					code = menu.login(HOST);	//이 메서드에서 로그인 성공 시 HOST_LOGIN으로 host의 state가 바뀜
					break;
				}
				break;
			case HOST_BOOK: // 재고관리
				code = menu.hostBookMenu();
				break;
			case HOST_BOOK_LIST: // 책 목록
				code = host.listBook();
				break;
			case HOST_BOOK_ADD: // 책 추가
				code = host.addBook();
				break;
			case HOST_BOOK_UPDATE: // 책 수정
				code = host.modifyBook();
				break;
			case HOST_BOOK_DEL: // 책 삭제
				code = host.deleteBook();
				break;
			// case HOST_ORDER: // 주문관리
			// code = menu.hostOrderMenu();
			// break;
			case HOST_ORDER_LIST: // 주문 목록
				code = host.listOrder();
				break;
			// case HOST_ORDER_ADD: // 주문 추가
			// code = host.addOrder();
			// break;
			// case HOST_ORDER_DEL: // 주문 삭제
			// code = host.deleteOrder();
			// break;

			case GUEST: // 손님
				switch (guest.state) {
				case GUEST_LOGIN:
					code = GUEST_ORDER;
					break;
				case GUEST_LOGOUT:
					code = menu.login(GUEST);
					break;
				}
				break;
			case GUEST_ORDER:
				code = menu.guestOrderMenu();
				break;
			case GUEST_ORDER_ADD: // 구매
				code = guest.buy();
				break;
			case GUEST_ORDER_DEL: // 환불
				code = guest.refund();
				break;
			case 0: // 1. 주인 2. 손님 0. 종료에서 0번 입력 시 return으로 Main을 끝냄. 즉 프로그램 끝
				System.out.println("서점 문을 닫습니다.");
				return;
			default:
				code = SHOP_LOGIN; // SHOP_LOGIN 화면에서 입력값이 이상하면 무조건 다시 그 창을 띄워줌
				break;
			}
		}
	}
}
/*
서점 문을 엽니다.

1: 주인, 2: 손님, 0: 나가기
▶ 1
로그인 정보를 입력하세요.
아이디
▶ host
암호
▶ host
Good day, Sir.
1:재고관리, 2:주문목록, 0:종료
▶ 1
1:책목록, 2:책추가, 3:책수정, 4:책삭제, 0:종료
▶ 2
책 정보를 입력하세요.
제목
▶ JSP
저자
▶ JSP
가격
▶ 1503
책을 책꽂이에 꽂았습니다.
1:책목록, 2:책추가, 3:책수정, 4:책삭제, 0:종료
▶ 2
책 정보를 입력하세요.
제목
▶ Java
저자
▶ Java
가격
▶ 125435
책을 책꽂이에 꽂았습니다.
1:책목록, 2:책추가, 3:책수정, 4:책삭제, 0:종료
▶ 2
책 정보를 입력하세요.
제목
▶ PHP
저자
▶ PHP
가격
▶ 5346
책을 책꽂이에 꽂았습니다.
1:책목록, 2:책추가, 3:책수정, 4:책삭제, 0:종료
▶ 2
책 정보를 입력하세요.
제목
▶ helloworld
저자
▶ helloworld
가격
▶ 235406
책을 책꽂이에 꽂았습니다.
1:책목록, 2:책추가, 3:책수정, 4:책삭제, 0:종료
▶ 2
책 정보를 입력하세요.
제목
▶ oracle
저자
▶ oracle
가격
▶ 112354
책을 책꽂이에 꽂았습니다.
1:책목록, 2:책추가, 3:책수정, 4:책삭제, 0:종료
▶ 1
[1] JSP | by JSP | $1503
[2] Java | by Java | $125435
[3] PHP | by PHP | $5346
[4] helloworld | by helloworld | $235406
[5] oracle | by oracle | $112354
1:책목록, 2:책추가, 3:책수정, 4:책삭제, 0:종료
▶ 3
[1] JSP | by JSP | $1503
[2] Java | by Java | $125435
[3] PHP | by PHP | $5346
[4] helloworld | by helloworld | $235406
[5] oracle | by oracle | $112354
책번호를 입력하세요.
▶ 4
제목
▶ Stand By Me
저자
▶ F.R.Smith
가격
▶ 346546
책정보를 다음과 같이 수정하였습니다.
[4] Stand By Me | by F.R.Smith | $346546
1:책목록, 2:책추가, 3:책수정, 4:책삭제, 0:종료
▶ 4
[1] JSP | by JSP | $1503
[2] Java | by Java | $125435
[3] PHP | by PHP | $5346
[4] Stand By Me | by F.R.Smith | $346546
[5] oracle | by oracle | $112354
삭제하실 책 번호를 입력하세요.
▶ 2
책을 책꽂이에서 제거하였습니다.
[1] JSP | by JSP | $1503
[3] PHP | by PHP | $5346
[4] Stand By Me | by F.R.Smith | $346546
[5] oracle | by oracle | $112354
1:책목록, 2:책추가, 3:책수정, 4:책삭제, 0:종료
▶ 0
1:재고관리, 2:주문목록, 0:종료
▶ 0
1: 주인, 2: 손님, 0: 나가기
▶ 2
로그인 정보를 입력하세요.
아이디
▶ guest
암호
▶ guest
1:구매, 2:환불, 0:종료
▶ 1
[1] JSP | by JSP | $1503
[3] PHP | by PHP | $5346
[4] Stand By Me | by F.R.Smith | $346546
[5] oracle | by oracle | $112354
구입할 책의 번호를 입력하세요.
▶ 1
다음은 구매한 목록입니다.
[1] JSP | by JSP | $1503
1:구매, 2:환불, 0:종료
▶ 1
[1] JSP | by JSP | $1503
[3] PHP | by PHP | $5346
[4] Stand By Me | by F.R.Smith | $346546
[5] oracle | by oracle | $112354
구입할 책의 번호를 입력하세요.
▶ 2
해당 번호의 책이 없습니다.
1:구매, 2:환불, 0:종료
▶ 1
[1] JSP | by JSP | $1503
[3] PHP | by PHP | $5346
[4] Stand By Me | by F.R.Smith | $346546
[5] oracle | by oracle | $112354
구입할 책의 번호를 입력하세요.
▶ 3
다음은 구매한 목록입니다.
[1] JSP | by JSP | $1503
[3] PHP | by PHP | $5346
1:구매, 2:환불, 0:종료
▶ 1
[1] JSP | by JSP | $1503
[3] PHP | by PHP | $5346
[4] Stand By Me | by F.R.Smith | $346546
[5] oracle | by oracle | $112354
구입할 책의 번호를 입력하세요.
▶ 4
다음은 구매한 목록입니다.
[1] JSP | by JSP | $1503
[3] PHP | by PHP | $5346
[4] Stand By Me | by F.R.Smith | $346546
1:구매, 2:환불, 0:종료
▶ 1
[1] JSP | by JSP | $1503
[3] PHP | by PHP | $5346
[4] Stand By Me | by F.R.Smith | $346546
[5] oracle | by oracle | $112354
구입할 책의 번호를 입력하세요.
▶ 5
다음은 구매한 목록입니다.
[1] JSP | by JSP | $1503
[3] PHP | by PHP | $5346
[4] Stand By Me | by F.R.Smith | $346546
[5] oracle | by oracle | $112354
1:구매, 2:환불, 0:종료
▶ 1
[1] JSP | by JSP | $1503
[3] PHP | by PHP | $5346
[4] Stand By Me | by F.R.Smith | $346546
[5] oracle | by oracle | $112354
구입할 책의 번호를 입력하세요.
▶ 1
다음은 구매한 목록입니다.
[1] JSP | by JSP | $1503
[3] PHP | by PHP | $5346
[4] Stand By Me | by F.R.Smith | $346546
[5] oracle | by oracle | $112354
[1] JSP | by JSP | $1503
1:구매, 2:환불, 0:종료
▶ 2
1번: [1] JSP | JSP | $1503
2번: [3] PHP | PHP | $5346
3번: [4] Stand By Me | F.R.Smith | $346546
4번: [5] oracle | oracle | $112354
5번: [1] JSP | JSP | $1503
환불할 책의 번호를 입력하세요.
▶ 1
책을 환불하였습니다.
1:구매, 2:환불, 0:종료
▶ 2
1번: [3] PHP | PHP | $5346
2번: [4] Stand By Me | F.R.Smith | $346546
3번: [5] oracle | oracle | $112354
4번: [1] JSP | JSP | $1503
환불할 책의 번호를 입력하세요.
▶ 3
책을 환불하였습니다.
1:구매, 2:환불, 0:종료
▶ 2
1번: [3] PHP | PHP | $5346
2번: [4] Stand By Me | F.R.Smith | $346546
3번: [1] JSP | JSP | $1503
환불할 책의 번호를 입력하세요.
▶ 2
책을 환불하였습니다.
1:구매, 2:환불, 0:종료
▶ 0
1: 주인, 2: 손님, 0: 나가기
▶ 1
로그인 정보를 입력하세요.
아이디
▶ host
암호
▶ host
Good day, Sir.
1:재고관리, 2:주문목록, 0:종료
▶ 2
다음은 주문 목록입니다.
[3] PHP | by PHP | $5346
[1] JSP | by JSP | $1503
1:재고관리, 2:주문목록, 0:종료
▶ 0
1: 주인, 2: 손님, 0: 나가기
▶ 0
서점 문을 닫습니다.
 */
