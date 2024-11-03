package tests;


import org.junit.Assert;
import oldshelf.*;
import org.junit.Test;

public class OldSelectionTest{
    @Test

    public void test1(){
        TextBook t = new TextBook("Politics");
        Assert.assertEquals(OldSelection.getAgeOrTitle(t),"Politics");
    }
    @Test

    public void test2(){
        Fiction f = new Fiction("Transformers",FictionType.GoK);
        Assert.assertEquals(OldSelection.getAgeOrTitle(f),"Age of Ultron");
    }
}



/*
 * package bonus;

public sealed interface IBook<T> extends Comparable<IBook<T>> permits Comic, Fiction, TextBook {
  
    @Override
    int compareTo(IBook<T> other);
}
enum FictionType {

	Comedy,
	Tragedy,
	GoK
}

record Comic(String Title,int ageOfMainCharacter) implements IBook<Integer> {
	
	 @Override
    public int compareTo(IBook<Integer> other) {
        if (other instanceof Comic otherComic) {
            return this.ageOfMainCharacter-otherComic.ageOfMainCharacter;
        }
        return 0; 
    }

}

record Fiction(String name,FictionType type) implements IBook<FictionType> {

	public int compareTo(IBook<FictionType> other) {
        if (other instanceof Fiction otherFiction) {
            return this.type.compareTo(otherFiction.type); 
        }
        return 0; 

	}
}

 */