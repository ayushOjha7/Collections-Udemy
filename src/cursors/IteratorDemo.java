package cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IteratorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();

		System.out.print("Enter Size : ");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++)
			list.add(sc.nextInt());

		System.out.println(list);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			if (integer % 3 == 0)
				System.out.println(integer);
			else
				itr.remove();
		}

		System.out.println(list);
		sc.close();
	}

}
