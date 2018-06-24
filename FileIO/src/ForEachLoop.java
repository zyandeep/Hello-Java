// Testing the for-each loop in Java

class ForEachLoop {

	public static void main(String[] args) {
	
		int[] a = {1,2,3,4,5};
		float[] f = new float[5];
		f[0] = 10;
		f[1] = 5;
		
		String[] str = new String[3];
		str[0] = "Hello";
		str[1] = "world";
		
		System.out.println("demo of the enhanced for loop...");
		for(int i : a) {
		
			System.out.println(i);
		}
		
		for(float ff  : f) {
		
			System.out.println(ff);
		}
		
		for(String s : str) {
		
			System.out.println(s);
		}
		
	}
}