interface Display {
	void disp(); 
}

interface Printable {  
	void print();  
}

interface Showable extends Display, Printable {  
	void show();  
} 


public class MultipleInterface implements Showable {  
	public void print() {
		System.out.println("Hello");
	}  
	public void show() {
		System.out.println("Welcome");
	}
	public void disp() {
		System.out.println("Goodbye");
	}

  
  public static void main(String args[]) {  
  	MultipleInterface obj = new MultipleInterface();  
  	obj.print();  
  	obj.show();
  	obj.disp();  
  }  
}