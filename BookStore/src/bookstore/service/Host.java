package bookstore.service;

public interface Host {
	public static final String ID = "host";
	public static final String PASS = "host";
	
	abstract int listBook();
	abstract int addBook();
	abstract int modifyBook();
	abstract int deleteBook();
	
	abstract int listOrder();
	abstract int addOrder();
	abstract int deleteOrder();
	
	abstract void hostLogin();
	abstract void hostLogout();

}
