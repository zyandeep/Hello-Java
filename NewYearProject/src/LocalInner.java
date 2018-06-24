// inner class within a block

public class LocalInner {

	String s = "Hi there!"; 
	int age = 10;
	
	// Inn i = new Inn();  inner class Inn is not accessible outside of the method testInn()
	
	//inner class declared within a method
	void testInn() {
		
		class Inn {
			final String s = "Zyandeep";
			int age = 20;
			
			void dispalyOwn() {
				System.out.printf("%d\n", age);
				System.out.format("%s\n", s);
			}
			
			// how to access outer class members those have same name with inner class members???
			/*void dispalyOuter() {
				System.out.printf("%d\n", age);
				System.out.format("%s\n", s);
			}*/
		}
		
		Inn i = new Inn();
		i.dispalyOwn();
		//i.dispalyOuter();
	}
	
}
