/* Demo of 1-D array
*  Date: 25-Aug-13
**************************/
class Array2
{
	public static void main(String[] z)
	{
		// initialisation of 1-D array
		int arr[]={ 10,12,23,45,232,453,65,76,87,100};
		double sum=0;
		for(int temp:arr)
		{
			sum=sum+temp;
		}
		System.out.println("\n Array elements are... ");
		for(int temp:arr)
		{
			System.out.print(+temp+"\t");
		}
		System.out.println("\n Average is: "+(sum/10));
	}
}