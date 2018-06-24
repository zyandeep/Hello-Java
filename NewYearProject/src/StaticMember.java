/**
 * Demo of static members
 * Date: 10/01/2014
 */

public class StaticMember {

	// static( or class) members
	private static int year = 2014, month = 01;
	
	// instance members
	private int day;
	private String week;
	
	// default constructor
	public StaticMember() {
		this.day = 1;
		this.week = "Sunday";
		
		//year = 200;	
	}
	
	// constructor to initialize instance fields
	public StaticMember( int d, String w) {
		this.day = d;
		this.week = w;
	}
	
	// static method accessing non-static members by a reference variable 
	public static void showDate( StaticMember r) {
		
		System.out.println("day:\t" + r.day + ", " + r.week);
		System.out.println("month:\t" + month);
		System.out.println("year:\t" + year);
	}
	
	// non-static method accessing static fields
	// within the same class static members can be accessed without calling the class name
	public void changeStatic( int y, int m) {
		year = y;
		month = m;
	}
}
