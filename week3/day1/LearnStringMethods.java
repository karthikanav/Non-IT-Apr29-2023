package week3.day1;

public class LearnStringMethods {

	public static void main(String[] args) {

//String literal
		String name="TestLeaf";
		String name2="Testleaf";
//String object
		String s=new String("TestLeaf");
		String s1=new String("TestLeaf");
		
		
		//m1-length()---method
		int length = name.length();//assign to local vaiable -ctrl+2+l
//0-7
		System.out.println(length);
		
		int length2 = name2.length();
		System.out.println(length2);
		
		System.out.println(s.length());
		
		//m2-equals
		//String this == will check memory address
		if(name.equals(s)) {
			System.out.println("it using equals :true");
		}else {
			System.out.println("it using equals :false");
		}
		
		if(s==s1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//m3-
		if(name2.equalsIgnoreCase(s1)) {
			System.out.println("equalsIgnoreCase : true");
			
		}else {
			System.out.println("equalsIgnoreCase : false");

		}
		
		//m4-
		String data="Gokul";
		boolean contains = data.contains("k");
		System.out.println(contains);
		
		//m5-tocharArray
		
		String value="vinoth";
		char[] ch = value.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println("-------------------------------");
		System.out.println("***************************");
		for (int i =  ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
		
		System.out.println("**************************");
		//m6-chatAt
		
		String set="Ranjini";
		char charAt = set.charAt(3);
		System.out.println(charAt);
		
	//m7-lowercase
		String data1="TestLeaf";
		String lowerCase = data1.toLowerCase();
		System.out.println(lowerCase);
	//m8-uppercase	
		String upperCase = data1.toUpperCase();
		System.out.println(upperCase);
	//m9-replace
		String list="amazon";
		//rplace a=@
		String replace = list.replace("z", "@");
		
		System.out.println(replace);
		
		//m-10 split
		String prodcut="Learning java in java session";
		
		//gninraeL avaj ni avaj noisses
		String[] split = prodcut.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			char[] ch1= split[i].toCharArray();
			for (int j = ch1.length-1; j >=0; j--) {
				
				System.out.print(ch1[j]);
			}
			
			System.out.print(" ");
		}
		
		
	}

}
