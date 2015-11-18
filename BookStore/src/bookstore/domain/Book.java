package bookstore.domain;

public class Book {
	static int number = 1;
	int num;
	String title;
	String writer;
	int price;
	
	public Book(String title, String writer, int price) {
		this.num = number;
		this.title = title;
		this.writer = writer;
		this.price = price;
		number++;
	}
	
	public String toString() {
		return "[" + num + "] " + title + "|" + writer + "| $" + price; 
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
