package cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListIteratorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();

		System.out.print("Enter Size : ");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++)
			list.add(sc.nextInt());

		System.out.println(list);

		ListIterator<Integer> itr = list.listIterator();

		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			if (integer % 3 == 0)
				System.out.println(integer);
			else if (integer % 2 == 0) {
				itr.set(11);
				System.out.println(integer);
			} else
				itr.remove();
		}

		System.out.println(list);
		sc.close();
	}

}
