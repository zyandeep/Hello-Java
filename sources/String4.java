/* String as character array in Java
   Date: 23 sept,13
***************************/
class String4
{
	public static void main(String[] args){
	
		char[] str1={'h','e','l','l','o'};
		char[] str2={'h','e','l','l','o'};
		char[] str3=new char[5];
		str3[0]='h';
		str3[1]='e';
		str3[2]='l';
		str3[3]='l';
		str3[4]='o';
		System.out.println(" Length of str1: " +str1.length);
		System.out.println(str1==str2);  // not same as String class
		System.out.println(str1==str3);	
	}
}