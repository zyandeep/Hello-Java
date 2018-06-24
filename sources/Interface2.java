/* Extending an Interface
*  Date: 03-Oct-13
*************************/
interface Data
{
	String name="Zyandeep";
	int roll=10;
	char sex='M';
}

interface Display
{
	void display();
}

interface MainInt extends Data,Display   // multiple inheritance through interface
{
	String nationality=new String("Indian");
	Long contact=8721075704L;
}

class Interface2 implements Data,Display,MainInt    // multiple inheritance through interface
{
	public void display()
	{
		System.out.println(name);
		System.out.println(roll);
		System.out.println(contact);
		System.out.println(sex);
		System.out.println(nationality);
	}
	
	public static void main(String[] args)
	{
		Interface2 i=new Interface2();
		i.display();
	}
}
	