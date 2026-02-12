class Sum2
{
	public static void main(String[]args)
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int target = 15;
		for (int i = 0; i < arr.lenght;i++) {
			for(int j = i+1; j < arr.lenght; j++) {
				if (arr[i]) + arr[j] == target) {
					System.out.println(arr[i] + "+" + arr[j] + "=" + target);
				}
			}
		}
	}
}