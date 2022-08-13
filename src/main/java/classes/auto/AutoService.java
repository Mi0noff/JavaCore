package classes.auto;

/**
 * Сервис по работе с автомобилями
 */

public class AutoService {

    /**
     * Данный метод возвращает автомобили марки BMW
     *
     * @param autos все автомобили
     * @return массив автомобилей БМВ.
     */
    public Auto[] getOnlyCarsByModel(Auto[] autos, String model) {

        int count = 0;
        for (Auto auto : autos) {
            if (auto.getModel().equals(model)) {
                count++;
            }
        }

        Auto[] result = new Auto[count];

        for (Auto auto : autos) {
            if (auto.getModel().equals(model)) {
                count--;
                result[count] = auto;
            }
        }
        return result;
    }

    /**
     * Принято считать что если автомобиль двух-местный, то он из спорт-класса
     * Данный метод возвращает автомобили спорт-класса
     *
     * @param autos все автомобили
     * @return автомобили спорт-класса
     */
    public Auto[] getSportCars(Auto[] autos, int seatsCount) {

        int count = 0;
        for (Auto auto : autos) {
            if (auto.getSeatsCount() == seatsCount) {
                count++;
            }
        }

        Auto[] result = new Auto[count];

        for (Auto auto : autos) {
            if (auto.getSeatsCount() == seatsCount) {
                count--;
                result[count] = auto;
            }
        }
        return result;
    }

    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     *
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач.
     */
    public Auto[] getOnlyAutomaticTypeCars(Auto[] autos, String typeTransmission) {

        int count = 0;
        for (Auto auto : autos) {
            if (auto.getTransmission().equals(typeTransmission)) {
                count++;
            }
        }

        Auto[] result = new Auto[count];

        for (Auto auto : autos) {
            if (auto.getTransmission().equals(typeTransmission)) {
                count--;
                result[count] = auto;
            }
        }
        return result;
    }

    public Auto[] getOnlyMercedesEClassCars(Auto[] autos, String model, String mark) {

        int count = 0;
        for (Auto auto : autos) {
            if (auto.getModel().equals(model) && auto.getMark().contains(mark)) {
                count++;
            }
        }

        Auto[] result = new Auto[count];

        for (Auto auto : autos) {
            if (auto.getModel().equals(model) && auto.getMark().contains(mark)) {
                count--;
                result[count] = auto;
            }
        }
        return result;
    }
}