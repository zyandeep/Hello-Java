class Exp3 {

	public static void main(String[] args) {

		if (args[0].equals("Hello")) {
			System.out.println("String is right");
		}
		else {
			try {
				throw new Exception("Invalid String");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
			
	}
}