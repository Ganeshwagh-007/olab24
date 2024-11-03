package newshelf;

public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object obj) {
		
		// if (obj instanceof Comic cc) {
		// 	return ((Comic) obj).Title();
		// }
		// if(obj instanceof TextBook tb){
		// 	return ((TextBook) obj).subject();
		// }	
		// if(obj instanceof Fiction fc){
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
		TextBook tb = new TextBook("Hostory");
		
		Comic cc = new Comic("Spiderman",16);
		
		Fiction fc = new Fiction("Lord of the rings",FictionType.Tragedy);
		
		System.out.println(getAgeOrTitle(fc));
		
		System.out.println(getAgeOrTitle(cc));
		
		System.out.println(getAgeOrTitle(tb));		
	}
}