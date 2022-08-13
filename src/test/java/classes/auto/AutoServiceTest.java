package classes.auto;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AutoServiceTest {

    private Auto[] autos = {
            new Auto("volvo", "XC90", 4, "Automatic"),
            new Auto("BMW", "M5", 2, "Automatic"),
            new Auto("mercedes", "C 180", 4, "Mechanical"),
            new Auto("haval", "F7", 2, "Automatic"),
            new Auto("mercedes", "E 212", 2, "Automatic"),
            new Auto("lada", "Vesta", 4, "Mechanical"),
            new Auto("mercedes", "E 500", 4, "Automatic")

    };

    @Test
    public void getOnlyBmwCars() {

        AutoService autoService = new AutoService();
        Auto[] resultArray = autoService.getOnlyCarsByModel(autos, "BMW");
        Arrays.stream(resultArray)
                .forEach(System.out::println);

    }

    @Test
    public void getSportCars() {

        AutoService autoService = new AutoService();
        Auto[] resultArray = autoService.getSportCars(autos, 2);
        Arrays.stream(resultArray)
                .forEach(System.out::println);
    }

    @Test
    public void getOnlyAutomaticCars() {

        AutoService autoService = new AutoService();
        Auto[] resultArray = autoService.getOnlyAutomaticTypeCars(autos, "Automatic");
        Arrays.stream(resultArray)
                .forEach(System.out::println);
    }

    @Test
    public void getOnlyEClassCars () {

        AutoService autoService = new AutoService();
        Auto[] resultArray = autoService.getOnlyMercedesEClassCars(autos, "Automatic", "E");
        Arrays.stream(resultArray)
                .forEach(System.out::println);
    }
}
