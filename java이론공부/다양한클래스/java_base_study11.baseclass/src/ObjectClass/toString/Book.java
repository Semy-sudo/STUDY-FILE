package ObjectClass.toString;

public class Book {
	int booknum;
	String booktitle;
	
	public Book(int booknum, String booktitle){
		this.booknum = booknum;
		this.booktitle = booktitle;
	}
	@Override
	public String toString() {
		return booktitle +"," +booknum;
	}

}
