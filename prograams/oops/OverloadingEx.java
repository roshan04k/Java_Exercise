package prograams.oops;

//By Changing the no of arguments
public class OverloadingEx {
	
	public void add(int a, int b) {
		int ans=a+b;
		System.out.println(ans);
	}

	public void add(int a, int b, int c) {
		int ans=a+b+c;
		System.out.println(ans);
	}
	
//	public void add(float a,int b) {
//		float ans=a+b;
//		System.out.println(ans);
//	}
	
	public static void main(String[] args) {
		OverloadingEx ol = new OverloadingEx();
		ol.add(10,20);
		ol.add(10,20,30);
		//ol.add(10.9, 20);
	}

}
