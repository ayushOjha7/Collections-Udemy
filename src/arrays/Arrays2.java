package arrays;

public class Arrays2 {

	public static void main(String[] args) {

		int a=sum(new int[] { 1, 2, 3 });				//Anonymous Array
		System.out.println(a);
	}

	private static int sum(int[] is) {
		int total = 0;
		for (int i : is)
			total += i;
		return total;
	}

}
