package arrays;

public class Arrays1 {

	public static void main(String[] args) {

//		int[] array1=new int[5];
//		System.out.println(array1);
//		for(int k:array1)
//		System.out.print(array1[k]+" ");

		int[][] array2 = new int[2][];
		System.out.println(array2);
		System.out.println(array2[0]);
		System.out.println(array2[1]);
//		System.out.println(array2[0][0]);				// null pointer Exception

		array2[0] = new int[2];
		array2[1] = new int[3];
		
//		array2[0]= {1,2,3};								// can not be initialized here

		int[] array3={1,2,3};
		array2[0]=array3;
		
		for (int[] k : array2) {
			System.out.print("row ---> ");
			for (int j : k) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
