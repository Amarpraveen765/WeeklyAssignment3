package com.codingassignment3;

import java.util.ArrayList;

public class BusinessLogic {
	public ArrayList<Library> addBooks() {
		Library p = new Library(112, "The Christmas Pig", "JK Rowling");
		Library p1 = new Library(223, "Whereabouts", "Amar");
		Library p2 = new Library(334, "Queen of Fire", "Devika Rangachari");
		Library p3 = new Library(445, "Listen to Your Heart: The London Adventure", "Ruskin Bond");
		Library p4 = new Library(556, "A Place Called Home", "Preeti Shenoy");

		ArrayList<Library> a = new ArrayList<Library>();
		a.add(p);
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);

		return a;
	}

	void displayBooks(ArrayList<Library> b) {
		System.out.println("list of Books");
		for (Library s : b) {
			System.out.println(s);
		}
	}

	void updateBooks(ArrayList<Library> p, String a, String b) {

		System.out.println("\n::::Book data after Update:::: ");
		for (Library e : p) {
			if (e.getAuthor().equals(a)) {
				e.setAuthor(b);
				System.out.println(e);
			}
		}
	}

	void deleteBook(ArrayList<Library> p, String a) {

		System.out.println("\n::::List of Books data after Deletion:::: ");
		for (Library k : p) {
			if (k.getAuthor().equals(a)) {
				k.setName("");
				k.setId(0);
				k.setAuthor("");
				
			}
			System.out.println(k);
		}

	}
}