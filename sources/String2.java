/* String array in Java
   Date: 21 sept,13
***************************/
class String2
{
	public static void main(String[] args)
	{
		String[] s={"Internet ","technology ","and ","web ","design."};
		for(int i=0; i<s.length; i++)
			System.out.println(s[i]);
		System.out.println("Concatanation... ");
		System.out.println(s[0]+s[1]+s[2]+s[3]+s[4]);	
	}
}
						