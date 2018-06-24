
public class MultipleIFace2 implements  MainInterFace, inner.InterFace2 {

	public static void main(String[] args) {
		
		MultipleIFace2 obj = new MultipleIFace2();
		
		obj.show();
		obj.add(2, 5);
		
	}
	
	public void print() { }
	public void print(String n, int a) { }
	
	// field 'i' must be refer by their interface name
	public void show() {
		System.out.println(MainInterFace.i);
		
		// fully qualified name
		System.out.println(inner.InterFace2.i );
		
	}
	
	public void add(int n1, int n2) {
		System.out.printf("\n %d + %d = %d\n", n1, n2, n1 + n2);		
	}
	
}
