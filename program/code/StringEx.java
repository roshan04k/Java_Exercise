package program.code;

public class StringEx {

	public static void main(String[] args) {
		//Using String object
		char[] ch = {'j','a','v','a'};
		String str = new String(ch);
		System.out.println(str);
		
		//Using String literal
		String str1="java";
		System.out.println(str1);
		
		//String literal with different variables
		String s1="java";
		String s2="java";
		String s3=" Developer";
		String s4=s1+s3;
		System.out.println(s4);

		//Updating the same string literal
		s1="Helloo!!!";
		s1=s1+s3;
		System.out.println(s1);
		
		//Sting object with different variable
		String s5="Hello";
		String s6=new String(" World");
		String s7 = s5+s6;
		System.out.println(s7);
		//Using cancat
		s7=s5.concat(s6);
		System.out.println(s7);		
	}
}
