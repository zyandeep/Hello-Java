// Using command-line argument in eclipse IDE 

public class CommandLineArg {

	public static void main(String[] args) {
		
		int i = 0;
		
		if(args.length == 0) {
			System.out.println("specify arguments!");
		}
		
		for(String str : args) {
			if(str == null)
				break;
			System.out.println("agrs[" + i + "]:\t" + str);
			i++;
		}

	}

}
