package bonus;

import java.util.*;

public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */

    // Added switch case instead of if else 
	public static String getAgeOrTitle(Object obj) {
		
		// if (obj instanceof Comic c) {
		// 	return ((Comic) obj).Title();
		// }
		// else if(obj instanceof TextBook t){
		// 	return ((TextBook) obj).subject();
		// }	
		// else if(obj instanceof Fiction f){
		// 	return ((Fiction) obj).name();
		// }
		switch(obj){
			case Comic(String Title,int ageOfMainCharacter) -> {
				return Title;
			}
			case Fiction(String name,FictionType type) -> {
				return name;
			}
			case TextBook(String subject) -> {
				return subject;
			}
			default -> {
				return null;
			}
		}
		

	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		IBook<Integer> c1 = new Comic("Spiderman", 12);
        IBook<Integer> c2 = new Comic("One Piece", 15);
        IBook<FictionType> f1 = new Fiction("Hamlet", FictionType.Tragedy);
        IBook<FictionType> f2 = new Fiction("Midnight Summers Dream", FictionType.Comedy);
        IBook<String> t1 = new TextBook("History");
        IBook<String> t2 = new TextBook("Politics");

		System.out.println("\nTesting compareTo method:");
        System.out.println("c1 vs c2: " + c1.compareTo(c2)); 
        System.out.println("f1 vs f2: " + f1.compareTo(f2));
        System.out.println("t1 vs t2: " + t1.compareTo(t2));
	}
}
