package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
	String name ="Amazon";
	//onzamA
	//step 1-convert into tocharArray
	//step2-forloop
	//step3-reverse condition
	//step4-syso
	
	char[] ch = name.toCharArray();
	for (int i = ch.length-1; i >=0; i--) {
		System.out.print(ch[i]);
	}

	}

}
