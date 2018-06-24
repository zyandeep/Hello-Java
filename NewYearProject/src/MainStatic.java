// demo of static members 

public class MainStatic {

	public static void main(String[] args) {
		
		// invoking the static method 
		StaticMember.showDate( new StaticMember() );
		System.out.format("\n %s", "**********************************************************\n");
		
		StaticMember.showDate( new StaticMember( 5, "Monday") );
		System.out.format("\n %s", "**********************************************************\n");
		
		StaticMember obj = new StaticMember( 10, "Friday");
		obj.changeStatic(2012, 3);
		StaticMember.showDate(obj);
		
	}

}
