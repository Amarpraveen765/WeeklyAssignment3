package com.codingassignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class BusinessLogic {
	Scanner sc = new Scanner(System.in);

	public ArrayList<Library> addBooks() {
		Library p = new Library("112", "The Christmas Pig", "JK Rowling");
		Library p1 = new Library("223", "Whereabouts", "Amar");
		Library p2 = new Library("334", "Queen of Fire", "Devika Rangachari");
		Library p3 = new Library("445", "Listen to Your Heart: The London Adventure", "Ruskin Bond");
		Library p4 = new Library("556", "A Place Called Home", "Preeti Shenoy");

		ArrayList<Library> a = new ArrayList<Library>();
		a.add(p);
		a.add(p1);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		return a;
	}

	void displayBooks(ArrayList<Library> b) {
		System.out.println("list of Books ");
		for (Library s : b) {
			System.out.println(s);
		}
	}

	void updateBooks(ArrayList<Library> p) {
		System.out.println("Enter the book id you want to update ");
		String id = sc.next();
		System.out.println("Enter the updated id, book name and author name ");
		for (Library e : p) {
			if (e.getId().equals(id)) {
				e.setId(sc.next());
				e.setName(sc.next());
				e.setAuthor(sc.next());
				System.out.println(e);
			}
		}
	}

	void deleteBook(ArrayList<Library> p) {
		System.out.println("enter the id of the book you want to delete ");
		String i = sc.next();
		System.out.println("\n::::List of Books data after Deletion:::: ");
		for (Library k : p) {
			if (k.getId().equals(i)) {
			p.remove(k);
			}
		}
		for (Library g : p) {
			System.out.println(g);
		}
		
	}
}