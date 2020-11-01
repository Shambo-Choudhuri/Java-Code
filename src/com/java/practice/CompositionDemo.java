package com.java.practice;
import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {

	public static void main(String[] args) {

		Book b1=new Book(100,"A");
		Book b2=new Book(200,"B");
		Book b3=new Book(300,"C");
		
		List<Book> books=new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		Library l=new Library(books);
		
		List<Book> TotalBooks=l.getTotalBooksInLibrary();
		
		int count=0;
		
		for(Book book:TotalBooks)
		{
			System.out.println(book.ID);
			System.out.println(book.Name);
			count++;
		}
		
		System.out.println(count);
		
		
		

	}

}


class Book
{
	int ID;
	String Name;
	
	
	Book(int ID,String Name)
	{
		this.ID=ID;
		this.Name=Name;
	}
	
	
}

class Library
{
	List<Book> books;//Reference of Book class
	
	Library(List<Book> books)
	{
		this.books=books;
	}
	
	public List<Book> getTotalBooksInLibrary()
	{
		return books;
	}
}


