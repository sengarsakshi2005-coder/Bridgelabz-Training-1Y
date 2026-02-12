import java.util.*;
class reverse_array  {
	public static void main(String[]args) {
		int arr [] = new int[5];
		arr [0] = 99;
		arr [1] = 67;
		arr [2] = 108;
		arr [3] = 45;
		arr [4] = 70;
		
		for ( int i = arr.lenght-1; i >= 0; i--) {
			System.out.println( arr [i] );
		}
	}
} 
