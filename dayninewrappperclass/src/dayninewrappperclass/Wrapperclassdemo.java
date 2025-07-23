package dayninewrappperclass;

public class Wrapperclassdemo {
	public static void main(String[] args) 
	{   
		//unboxing
		Integer i = new Integer(10);
		System.out.println(i);
		int    b = i.intValue();
		System.out.println(i);
		//autoboxing
		int a= 100;
		Integer i1= a;
		System.out.println(i1);
		
		String s="11";
		String s1= "10";
		System.out.println(s+s1);
		int x = Integer.parseInt(s);
		int y = Integer.parseInt(s1);
		System.out.println(x+y);
	}

}
