package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Book{
	private String name;
	private int price;
	
	public Book(String name,int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

//Q.모든 책의 가격의 합, 책 가격이 20,000원 이상 책이름 정렬해 출력

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",15000));
		bookList.add(new Book("안드로이드",30000));
		
		System.out.println("모든 책 가격의 합");
		int total = bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총합:"+total);

		System.out.println("책 가격이 20000원 이상 책이름 정렬해 출력");
		bookList.stream().filter(c->c.getPrice()>=20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
