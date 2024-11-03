package oldshelf;

public class OldSelection {

	// TODO: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object obj) {
		
		if (obj instanceof Book) {
		// 	if (obj instanceof Comic) 
		// 		return ((Comic)obj).getTitle();
		// 	else if (obj instanceof Fiction) 
		// 		return ((Fiction)obj).getName();
		// 	else if (obj instanceof TextBook) 
		// 		return ((TextBook)obj).getSubject();
			switch (obj.getClass().getSimpleName()) {
				case "Comic":
					return ((Comic)obj).getTitle();
				case "Fiction":
					return ((Fiction)obj).getName();
				case "TextBook":
					return ((TextBook)obj).getSubject();
				default:
					throw new AssertionError();
			}
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO: Write a test code here and execute and text.
		TextBook tb = new TextBook("History");
		System.out.println(getAgeOrTitle(tb));
		
		Fiction fc = new Fiction("Lord of the rings",FictionType.Tragedy);
		System.out.println(getAgeOrTitle(fc));
		
		Comic cc = new Comic("Spiderman", 16);
		System.out.println(getAgeOrTitle(cc));
	}
}