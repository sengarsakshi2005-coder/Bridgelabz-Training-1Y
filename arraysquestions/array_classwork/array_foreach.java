import java.util.*;
class array  {
	public static void main(String[]args) {
		int arr [] = new int[5];
		arr [0] = 99;
		arr [1] = 67;
		arr [2] = 108;
		arr [3] = 45;
		arr [4] = 70;
		System .out.println("using for each loop");
		for ( int i : arr ) {
			System.out.println(i);
		}
	}
}
