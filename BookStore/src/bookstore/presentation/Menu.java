package bookstore.presentation;

public interface Menu {
	int selectUser();
	int hostMenu();
	int hostBookMenu();
//	int hostOrderMenu();
	int guestOrderMenu();
	int login(String user);
	
}
