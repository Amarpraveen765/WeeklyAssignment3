package com.codingassignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessLogic o = new BusinessLogic();
		ArrayList<Library> z =o.addBooks();
		o.displayBooks(z);
		o.updateBooks(z, "Amar", "Jhumpa Lahiri");
		o.deleteBook(z,"Jhumpa Lahiri");

	}

}
