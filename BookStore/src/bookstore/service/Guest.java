package bookstore.service;

public interface Guest {
	public static final String ID = "guest";
	public static final String PASS = "guest";
	
	abstract int buy();
	abstract int refund();

	abstract void guestLogin();
	abstract void guestLogout();
}
