// Console output through Byte Stream

package outputpack;

public class ByteStreamOutput {

	public static void main(String[] args) {
		
		int age = 20;
		String str = "Hello World!";
		String name = "Zyandeep";
		
		// sending data to console using PrintStream's methods
		System.out.print(str + "\n");
		System.out.println(name + "\t" + age);
		System.out.printf("PRINTF:\tName: %s\tAge: %d\n", name, age);
		System.out.format("\nFORMAT:\t%s\nName: %s\tAge: %d",str, name, age);

	}

}
