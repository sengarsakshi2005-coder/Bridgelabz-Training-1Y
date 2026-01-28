import java.util.Scanner;
class smallestnum{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1 < num2 &&  num2 < num3){
			System.out.println(" is the first num is smallest");
		}
		else{
			System.out.println(" not smaller");
		}
		
		
	}
}

