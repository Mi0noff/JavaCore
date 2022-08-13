package string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void getTheBiggestString() {
        String[] strings = {
                "Падающий цветок",
                "Вернулся вдруг на ветку",
                "Оказалось: бабочка!"
        };

        BigString bigString = StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertEquals(23,bigString.getLength());
        Assert.assertEquals("Вернулся вдруг на ветку", bigString.getValue());
    }

    @Test
    public void whenEmptyArrayString () {
        String [] strings = null;
        BigString bigString = StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertNull(bigString);
    }

}