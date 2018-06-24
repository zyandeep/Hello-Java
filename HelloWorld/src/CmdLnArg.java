public class CmdLnArg {

	public static void main(String[] args) {
		
		int count = args.length;
		
		if(count == 0)
			System.out.printf("\n Zero arguments!");
		else{
			
			System.out.println("\n No of arguments = " + count);
			for(int i=0; i<count; i++)
				System.out.println("Java is " + args[i]);
		}
			

	}

}
