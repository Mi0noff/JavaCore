package classes.zoo;

public class ZooService {

    public long getAveragePriceByZoos (Zoo[] zoos) {

        double allPrices = 0;

        for (Zoo zoo : zoos) {
            allPrices = allPrices + zoo.getPrice();

        }

        return Math.round(allPrices / zoos.length);
    }

    public String getNameByTheBiggestZoos(Zoo[] zoos) {

        String name = "";
        int countAnimalsInZoo = 0;

        for (Zoo zoo : zoos) {
            int animalsSize = zoo.getAnimals().length;
            if (zoo.getAnimals().length > countAnimalsInZoo) {
               countAnimalsInZoo = animalsSize;
               name = zoo.getName();
           }
        }
        return name;
    }
}
