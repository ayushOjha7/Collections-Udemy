package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<Object>();
		List<String> list=new ArrayList<String>();
		
		al.add("Ayush");
		list.add("Ayush");
		list.add("frue");
		al.add(true);
		al.add(10);
		al.add("hemant");
		al.add("bhairav");
		al.add("baki");	
		al.add(null);
		System.out.println(al);
		
		al.remove(5);
		System.out.println(al);
		al.remove("hemant");
		al.set(0, al);
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		System.out.println(list);
		
	}

}
