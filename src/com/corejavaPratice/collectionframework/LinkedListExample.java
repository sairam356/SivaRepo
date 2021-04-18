package com.corejavaPratice.collectionframework;

import java.util.*;

public class LinkedListExample {

	static void testLinkedListMethods() {

		LinkedList<String> l = new LinkedList<>();

		l.add("Kondapur");
		l.add("Hyderabad");
		l.addFirst("Siva");
		System.out.println(l);
		System.out.println("##############################");
		l.removeFirst();
		System.out.println("##############################");
		System.out.println(l);

		l.addLast("Hitech");
		System.out.println(l);
		System.out.println("##############################");
		System.out.println(l.peek());

		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);

		System.out.println(l1);
		System.out.println("##############################");

		for (int i = 1; i <= 2; i++) {
			Integer k = l1.pop();
			l1.addLast(k);

		}
		
		System.out.println(l1);
		
		
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		
		System.out.println(s.pop());
		//push pop(),peek
		
		
		Vector v = new Vector();
		System.out.println(v.capacity());
		for(int i =0;i<12;i++) {
			v.add(i);
		}
		System.out.println(v.capacity());
	}

	public static void main(String[] args) {
		testLinkedListMethods();
	}
}
