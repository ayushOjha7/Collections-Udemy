package set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		ArrayList names=new ArrayList();
		
		names.add("ayush");
		names.add("asdk");
		names.add("arkjhgh");
		
		HashSet<String> hs1=new HashSet<String>();
		HashSet hs2=new HashSet(10);
		HashSet hs3=new HashSet(names);
		HashSet hs4=new HashSet(10,0.5f);

		System.out.println(hs3);
		hs1.add("gaurav");
		hs1.add("aur");
		hs1.add("gaura");
		hs1.removeIf(n-> (n.charAt(0)=='g'));
		
		System.out.println(hs1);
		
		
	}

}
