// constructor with this

public class ConstFun {
	
	private String name = "Zyandeep";
	private int age = 20;
	
	public ConstFun() {
		System.out.println("Zero argument constructor is invoked!");
		System.out.println(name +"\t" + age);
		
	}
	
	public ConstFun(String name, int age) {
		
		//constructor call must be the first line within a constructor
		//zero argument constructor is invoked
		this();
		System.out.println("Two argument constructor is invoked!");
		this.name = name;
		this.age = age;
		
		System.out.println(this.name +"\t" + this.age);	
	}
	
	public ConstFun(String name) {
		
		//invoked zero arg constructor
		this();
		System.out.println("Name manupulator constructor is invoked!");
		this.name = name;
		
		System.out.println(this.name +"\t" + this.age);
	}
	
}
