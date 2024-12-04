package program.code;

import java.util.Arrays;

public class StrinngMethods {

	public static void main(String[] args) {
		//Int Length
		String str="Roshan";
		int len = str.length();
		System.out.println("1. Length : "+len);
		
		//Charat(Char index)
		String s1="Roshan";
		char c= s1.charAt(4);
		System.out.println("2. CharAt : "+c);
		
		//Equal(Object obj)
		String s2="JAVA";
		String s3="java";
		boolean s4=s2.equals(s3);
		System.out.println("3. Equals : "+s4);
		
		//EqualsIgnoreCase(String AnotherString)
		System.out.println("4. EqualIgnoreCase: "+s2.equalsIgnoreCase(s3));
		
		//toUpperCase(String)
		System.out.println("5. Upper case: "+str.toUpperCase());

		//toLowerCase(String)
		System.out.println("6. Lower case: "+str.toLowerCase());
		
		//char[] toCharArray()
		String str1="Frameworks In Java";
		char[] ch = str1.toCharArray();
		System.out.println("7. ToCharArray: "+Arrays.toString(ch));
				
		//CompareTo()
		//s1>s2--.>positive number
		//s1<s2--->negative number
		//s1==s2-->0
		String str2="Heuits";
		String str3="Hellos";
		System.out.println("8. CompareTo: "+str2.compareTo(str3));
		
		//split()-->Replace for string tokenizer concept
		String str4 = "Object oriented programming language";
		String[] data = str4.split("\\s");
		System.out.println("9. Split: ");
		for(String d: data) {
			System.out.println(d);
		}
		
		//String Intern()
		String str5="java";
		String str6=new String("java");
		String str7=str6.intern();
		System.out.println("10. Intern : ");
		System.out.println(str5==str6);
		System.out.println(str5==str7);
		
		//void getchars(srcindex,endindex,char[] dist,distindexbegin)
		String str8=new String("Welcome to java ");
		char[] ch1=new char[6];
		str8.getChars(11, 15, ch1, 2);
		System.out.print("11. GetChars : ");
		System.out.println(ch1);
		
		//concat
		System.out.println("12.Concat: "+str5.concat(str6));
		
		//13. indexof(int ch)
		System.out.println(str8.indexOf('o'));
		
		//14.lastIndexof(int ch)
		System.out.println(str8.lastIndexOf('o'));
		
		//15. substring()
		System.out.println(str8.substring(11));
		
		//16. replace(old char,new char)
		System.out.println(str8.replace('o', 'a'));
	}
}