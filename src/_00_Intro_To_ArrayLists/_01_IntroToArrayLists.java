package _00_Intro_To_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
ArrayList<String>list= new ArrayList<String>();
        // 2. Add five Strings to your list
list.add("hello");
list.add("this");
list.add("is");
list.add("very");
list.add("confusing");
        // 3. Print all the Strings using a standard for-loop
for (int i = 0; i < list.size(); i++) {
	String word= list.get(i);
	System.out.println(word);
}
        // 4. Print all the Strings using a for-each loop
for (String word : list) {
	System.out.println(word);
}
        // 5. Print only the even numbered elements in the list.
for (int i = 0; i < list.size(); i++) {
	String word= list.get(i);
	if (i%2==0) {
		System.out.println(word);
	}

}
System.out.println("_________________________");
        // 6. Print all the Strings in reverse order.
for (int i = list.size()-1; i >= 0; i--) {
	String word= list.get(i);
	System.out.println(word);
}
System.out.println("_________________________");
        // 7. Print only the Strings that have the letter 'e' in them.
for (int i = 0; i < list.size(); i++) {
	String word= list.get(i);
        if (word.contains("e")) {
        	System.out.println(word);
        }
        }
        }	
    }
