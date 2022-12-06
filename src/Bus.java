public class Bus extends Transport {
    protected Bus(String brand, String model, int yearRelease, String country, String color, double speed) {
        super(brand, model, yearRelease, country, color, speed);
    }

    protected final static void printBusInfo(Bus bus) {
        System.out.println("Поезд " + bus.getBrand() +
                ", модель " + bus.getModel() +
                ", " + bus.getYearRelease() + " год выпуска. Страна производства: " + bus.getCountry() +
                ", скорость перевижения -- " + bus.getSpeed() + " км/ч,"
        )
        ;
    }

    @Override
    public void refill() {
        setFuelPercentage(100);
        System.out.println("Автобус был заправлен бензином.");
    }
}
