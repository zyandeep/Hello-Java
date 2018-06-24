// use of package in java

import java.util.Scanner;
import packageA.*;
import packageB.*;

class MainDemo extends Demo1 implements Fibonacci {

	Scanner input = new Scanner(System.in);
	int num;
	
	MainDemo(int ma, int mb) {
	
		super(ma,mb);
	}
	
	void display() {
	
		System.out.println("Enter a number: ");
		num = input.nextInt();
		
		f(num);
		System.out.println(sum());
		System.out.println(ZYANDEEP);
	}
	
	public void f(int a) {
	
		int i = 0, j = 1, k;
		
		for(int z=1; z<=a; z++) {
		
			if(i==0 && j==1)
				System.out.println(+ i +"\n" + j);
				
			k = i+j;
			System.out.println(k);
			
			i=j;
			j=k;
		}
	}
	
	public static void main(String[] args) {
	
		MainDemo md = new MainDemo(5,2);
	
		md.display();
		System.out.println(Demo2.mul(2,5));
	}
} 