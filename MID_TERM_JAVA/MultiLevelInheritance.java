class Animal {  
	void eat() {
		System.out.println("I am eating...");
	}  
}

class Dog extends Animal {  
	void bark() {
		System.out.println("I am barking...");
	}  
}

class BabyDog extends Dog {  
	void weep() {
		System.out.println("I am weeping...");
	}  
}  


public class MultiLevelInheritance {
	
	public static void main(String[] args) {
		BabyDog bd = new BabyDog();

		bd.eat();
		bd.bark();
		bd.weep();
	}
}