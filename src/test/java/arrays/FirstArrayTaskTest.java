package arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstArrayTaskTest {

    @Test
    public void firstTest() {
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int result = FirstArrayTask.getCountEvenNumbers(numbers);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondTest() {
        int [] numbers = {1, 22, 31, 51, 83, 24};
        int result = FirstArrayTask.getCountEvenNumbers(numbers);
        int expected = 2;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void thirdTest () {
        int [] numbers = {6};
        int result = FirstArrayTask.getCountEvenNumbers(numbers);
        int expected = 1;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void fourthTest () {
        int [] numbers = {};
        int result = FirstArrayTask.getCountEvenNumbers(numbers);
        int expected = 0;
        Assert.assertEquals(expected,result);
    }
}
