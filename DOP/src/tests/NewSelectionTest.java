package tests;

import org.junit.Assert;
import newshelf.*;
import org.junit.Test;

public class NewSelectionTest{
    @Test
    public void test1(){
        TextBook t = new TextBook("Politics");
        Assert.assertEquals("Politics",NewSelection.getAgeOrTitle(t));
    }
    @Test
    public void test2(){
        Fiction f = new Fiction("Transformers",FictionType.GoK);
        Assert.assertEquals("Age of Ultron",NewSelection.getAgeOrTitle(f));
    }
}
