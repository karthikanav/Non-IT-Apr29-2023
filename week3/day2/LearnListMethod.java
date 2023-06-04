package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnListMethod {

	public static void main(String[] args) {
		List<String> mentors=new ArrayList<String>();
		//index start from'0'
   //m1-add
		mentors.add("Gokul");
		mentors.add("Vinoth");
		mentors.add("Ranjini");
		mentors.add("Dilip");
		
		System.out.println("add "+mentors);
		
		//m2-addAll
		List<String> additional=new ArrayList<String>();
		additional.addAll(mentors);
		additional.add("Ragu");
		additional.add("Vinoth");
		System.out.println("addAll"+additional);
		
		//m3-get
		
		String string = mentors.get(2);
		System.out.println("get"+string);
		
		//m4-remove
		additional.remove(5);
		System.out.println("remove "+additional);
		
		//add()
//		mentors.add(2, "Ragu");
//		System.out.println(mentors);
		
		//m5-removeAll
		
		boolean removeAll = additional.removeAll(mentors);
		//System.out.println(removeAll);
		System.out.println(additional);
		
		//size
		int size = mentors.size();
		System.out.println(size);
		
		//clear
//		mentors.clear();
//		System.out.println(mentors);
		
		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
		}

	}
}
