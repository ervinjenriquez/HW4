public class Homework4 {
	
	public static void main(String[] args) {
		
		//Repeat Method Call
		repeat("cs",3);
		repeat("HELLO", 5);
		
		//isReverse Method Call
		boolean a = isReverse("Java", "avaJ");
		boolean b = isReverse("hello", "ollhh");
		System.out.println(a);
		System.out.println(b);
		
		//starString Method Call
		System.out.println(starString(4));
		System.out.println(starString(0));
	}
	
	
	//Repeat Method 
	public static void repeat(String str, int n) {
		if (n == 0) {
			str = "";
			System.out.println(str);
		} else {
			System.out.print(str);
			repeat(str, n-1);
		}
	}
	
	//isReverse Method
	public static boolean isReverse(String s1, String s2) {
		char a = s1.charAt(0);
		char b = s2.charAt(s2.length()-1);
		boolean t= true;

		if (a == b){

			if(s1.length()>1 && s2.length()>1)
			t= isReverse(s1.substring(1), s2.substring(0, s2.length()-1));	
			return t;
		} 
		else {
			t= false;
			return t;
		}
	}
	
	public static String starString(int n) {
	
		String s = "";
		
		//How many stars there should be
		int i = (int)Math.pow(2, n);

		if (n == 0) {
			return "*";
		} else {
			//This loop is only to print out stars, recursion is still used in method
				for (int j = 0; j < i/2; j++ ) {
					s += "*";
				}
			return s + starString(n-1); 
			} 			
		}
	}

