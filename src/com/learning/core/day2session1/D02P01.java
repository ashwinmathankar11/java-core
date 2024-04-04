package com.learning.core.day2session1;

public class D02P01 {
	
	public static Book createBooks(String title, double price) {
        return new Book(title, price);
    }

	public static void showBooks(Book book) {
        System.out.println("Book Title: " + book.getBook_title());
        System.out.println("Book Price: " + book.getBook_price());
    }

    public static void main(String[] args) {
        
        Book book1 = createBooks("Java Programming", 350.00);

        showBooks(book1);
    }
}
