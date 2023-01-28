package list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Object> l=new LinkedList<Object>();
		
		l.add("ayush");
		l.add(true);
		l.add(22);
		System.out.println(l);
		l.set(2, 45);
		System.out.println(l);
	}

}
