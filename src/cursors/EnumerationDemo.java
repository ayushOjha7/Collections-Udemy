package cursors;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Vector : ");
		int size = sc.nextInt();

		for (int i = 0; i < size; i++)
			v.add(sc.nextInt());

		System.out.println(v);

		Enumeration<Integer> en = v.elements();

		while (en.hasMoreElements()) {
			Integer integer = (Integer) en.nextElement();
			if (integer % 3 == 0)
				System.out.println(integer);
		}
		sc.close();
	}

}
