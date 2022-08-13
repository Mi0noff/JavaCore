package classes.zoo;

public class Zoo {

    private double price;

    private String name;

    private Animal[] animals;

    public Zoo(double price, String name, Animal[] animals) {
        this.price = price;
        this.name = name;
        this.animals = animals;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
}
