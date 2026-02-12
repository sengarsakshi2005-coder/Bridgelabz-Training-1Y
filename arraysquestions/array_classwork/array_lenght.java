import java.util.*;
class array  {
	public static void main(String[]args) {
		int arr [] = new int[5];
		arr [0] = 99;
		arr [1] = 67;
		arr [2] = 108;
		arr [3] = 45;
		arr [4] = 70;
		System.out.println("print array with string :- ");
		System.out.println( Arrays.toString(arr));
		
		System.out.println("Lenght of an array :- " );
		System.out.println(arr.length );
		System.out.println("using for loop");
		for (int i = 0; i < arr.lenght; i++) {
			System.out println( arr [i] );
		}
	}
}
