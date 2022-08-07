package branchoperators.movie;

import org.junit.Assert;
import org.junit.Test;

public class MovieAccessServiceTest {

    @Test
    public void testFirst () {
        int age = 19;
        String result = MovieAccessService.accessMovie(age);
        String expected = "Rating R. Access is allowed.";
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testSecond () {
        int age = 22;
        String result = MovieAccessService.accessMovie(age);
        String expected = "Rating F. Access is allowed.";
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testThird () {
        int age = 17;
        String result = MovieAccessService.accessMovie(age);
        String expected = "Access is denied";
        Assert.assertEquals(expected,result);
        System.out.println("Wrong age, check the user with the given age");
    }
}
