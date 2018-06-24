/* Recursion in Java
   Date: 21 sept,13
***************************/
class Recursion
{
	int[] arr={1,2,3,4,5,6,7,0};
	void print(int i)
	{
		if(i==0)
			return;
		print(i-1);
		System.out.println("arr[" +(i-1)+ "]= "+arr[i-1]);
	}
}

class MainRec
{
	public static void main(String[] args)
	{
		Recursion rec=new Recursion();
		System.out.println("arr[] elements are displayed using Recursion :");
		System.out.println();
		rec.print(rec.arr.length);
	}
}