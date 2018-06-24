/* String class2
*  Date: 29-Sept-13
**************************/

class DemoString3
{
	char str[]={'w','o','r','l','d',' ','i','s',' ','b','e','a','u','t','i','f','u','l','!'};
	
	void extract(char n, int m)
	{
		int count=1,i;
		for(i=0; str[i]!=n; i++);  // gives the index of nth character
		
		// extracting given portion of the string
		
		System.out.println(" The extracted string is... ");
		for(; count<=m && i<str.length; i++)
		{
			System.out.print(str[i]);
			count++;
		}
	}
	
	public static void main(String[] args)
	{
		DemoString3 obj=new DemoString3();
		obj.extract('b',9);
	}
}
		