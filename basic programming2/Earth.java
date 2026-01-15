class Earth
{
	public static void main(String[]args)
	{
		double radiuskm = 6378;
		double pi = Math.PI;
		double volumekm3 = (4.0 / 3.0) * pi * Math.pow(radiuskm, 3);
		/*convert km3 ti miles ( 1 km=0.621371 miles)*/
		double kmToMiles = 0.621371;
		double volumeMiles3 = volumekm3 * Math.pow(kmToMiles, 3);
		System.out.println("The volume of Earth in cubic kilometers is: " + volumekm3);
		System.out.println("The volume of Earth in cubic miles is: " + volumeMiles3); 
	}
}