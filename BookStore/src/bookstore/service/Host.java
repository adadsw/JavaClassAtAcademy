package bookstore.service;

public interface Host {
	public static final String ID = "host";
	public static final String PASS = "host";
	
	abstract int listBook();
	abstract int addBook();
	abstract void modifyBook();
	abstract void deleteBook();
	
	abstract void listOrder();
	abstract void addOrder();
	abstract void deleteOrder();
	
	abstract void hostLogin();
	abstract void hostLogout();

}
