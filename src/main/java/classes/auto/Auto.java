package classes.auto;

public class Auto {

    private String model;

    private String mark;

    private int seatsCount;

    private String transmission;

    public Auto(String model, String mark, int seatsCount, String transmission) {
        this.model = model;
        this.mark = mark;
        this.seatsCount = seatsCount;
        this.transmission = transmission;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void setSeatsCount(int seatsCount) {
        this.seatsCount = seatsCount;
    }

    public String getTransmission() {
        return transmission;
    }


    public void setTransmission(String transmission) {
        this.transmission = transmission;

    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", seatsCount=" + seatsCount +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
