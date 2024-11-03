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