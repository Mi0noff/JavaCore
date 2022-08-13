package hightlevel;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenAllElementsPostCorrect() {
        char[] word = {'a', 'b', 'c', 'd', 'e'};
        char[] post = {'c', 'd', 'e'};
        boolean result = EndsWith.getCompirasionElements(word, post);
        Assert.assertEquals(true, result);
    }

    @Test
    public void whenTwoElementsPostCorrect() {
        char[] word = {'a', 'b', 'c', 'd', 'e'};
        char[] post = {'i', 'd', 'e'};
        boolean result = EndsWith.getCompirasionElements(word, post);
        Assert.assertEquals(false, result);
    }

    @Test
    public void whenAnotherCountPostElementsCorrect() {
        char[] word = {'a', 'b', 'c', 'd', 'e','f'};
        char[] post = {'c', 'd', 'e','f'};
        boolean result = EndsWith.getCompirasionElements(word, post);
        Assert.assertEquals(true, result);
    }

    @Test
    public void whenAllElementsPostIncorrect() {
        char[] word = {'a', 'b', 'c', 'd', 'e','f'};
        char[] post = {'y','g', 't', 's'};
        boolean result = EndsWith.getCompirasionElements(word, post);
        Assert.assertEquals(false, result);
    }
}