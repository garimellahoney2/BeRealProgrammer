/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Author
{
    String name;
    String email;
    String gender;
    Author(String name,String email,String gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}
class Book 
{
    String name;
    double price;
    int qtyInStock;
    Author author;
    Book(String name,double price,int qtyInStock,Author author)
    {
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
        this.author = author;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
    public String toString()
    {
    	return("book name "+name+" book price "+price+" book quantity "+qtyInStock+" author name "+author.name+" author email "+author.email+" author gender "+author.gender);
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Author author = new Author("auth", "gmail", "F");
		Book book = new Book("book",10,1,author);
		System.out.println(book.toString());
	}
}
