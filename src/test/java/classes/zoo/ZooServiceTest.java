package classes.zoo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZooServiceTest {

    @Test
    public void getAveragePriceByZoos() {

        Zoo kazan = new Zoo(
                1500.0,
                "Kazan",
                 new Animal[] {
                         new Animal("Лев"),
                         new Animal("Тигр"),
                         new Animal("Пантера")
                }
        );

        Zoo samara = new Zoo(
                1750.0,
                "Samara",
                new Animal[] {
                        new Animal("Рысь"),
                        new Animal("Лев"),
                        new Animal("Тигр"),
                        new Animal("Пантера")
                }
        );

        Zoo moscow = new Zoo(
                3000.0,
                "Moscow",
                new Animal[]{
                        new Animal("Рысь"),
                        new Animal("Гиена"),
                        new Animal("Сервал"),
                        new Animal("Лев"),
                        new Animal("Тигр"),
                        new Animal("Пантера")
                }
        );


        Zoo [] zoos = {kazan, samara, moscow};

        ZooService zooService = new ZooService();

        long result = zooService.getAveragePriceByZoos(zoos);
        System.out.println(result);
        Assert.assertEquals(2083, result);
    }

    @Test
    public void getTheBiggestZoo () {

        Zoo kazan = new Zoo(
                1500.0,
                "Kazan",
                new Animal[] {
                        new Animal("Лев"),
                        new Animal("Тигр"),
                        new Animal("Пантера")
                }
        );

        Zoo samara = new Zoo(
                1750.0,
                "Samara",
                new Animal[] {
                        new Animal("Рысь"),
                        new Animal("Лев"),
                        new Animal("Тигр"),
                        new Animal("Пантера")
                }
        );

        Zoo moscow = new Zoo(
                3000.0,
                "Moscow",
                new Animal[]{
                        new Animal("Рысь"),
                        new Animal("Гиена"),
                        new Animal("Сервал"),
                        new Animal("Лев"),
                        new Animal("Тигр"),
                        new Animal("Пантера")
                }
        );


        Zoo [] zoos = {kazan, samara, moscow};

        ZooService zooService = new ZooService();
        String resultName = zooService.getNameByTheBiggestZoos(zoos);
        String expected = "Moscow";
        Assert.assertEquals(expected, resultName);
    }
}