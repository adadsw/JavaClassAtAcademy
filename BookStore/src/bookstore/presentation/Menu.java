package bookstore.presentation;

public interface Menu {
	int hostMenu();
	int hostBookMenu();
//	int hostOrderMenu();
	int guestOrderMenu();
	int login(int host);
	
}
