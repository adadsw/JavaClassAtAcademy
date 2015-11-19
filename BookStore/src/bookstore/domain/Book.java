package bookstore.domain;

public class Book {
	public static int number = 1;
	int num;
	String title;
	String writer;
	int price;
	
	public Book(String title, String writer, int price) {
		this.num = number;
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	public Book(int num, String title, String writer, int price) {
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	public String toString() {
		return "[" + num + "] " + title + "|" + writer + "| $" + price; 
	}
	
	public String OrderedList(int i) {
		return i + 1 + "번. " + title + "|" + writer + "| $" + price ;
	}
	
	@Override
	public boolean equals(Object obj) {
		String compareValue = obj.toString();
		String thisValue = toString();
		return thisValue.equals(compareValue);
	}
	
	
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
}
