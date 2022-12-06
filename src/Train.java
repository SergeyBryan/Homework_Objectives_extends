public class Train extends Transport {
    private int price;
    private int time;
    private String startStation;
    private String finalStation;
    private int carriage;

    public Train(int price, int time, String startStation, String finalStation, int carriage, String brand, String model, int yearRelease, String country, double speed) {
        super(brand, model, yearRelease, country, speed);
        if (price == 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
        if (time == 0) {
            this.time = 0;
        } else {
            this.time = time;
        }
        if (startStation == null || startStation.isBlank() || startStation.isEmpty()) {
            this.startStation = "Default";
        } else {
            this.startStation = startStation;
        }
        if (finalStation == null || finalStation.isBlank() || finalStation.isEmpty()) {
            this.finalStation = "Default";
        } else {
            this.finalStation = finalStation;
        }
        if (carriage == 0) {
            this.carriage = 1;
        } else {
            this.carriage = carriage;
        }
    }

    public int getPrice() {
        return price;
    }

    protected final void setPrice(int price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    protected final void setTime(int time) {
        this.time = time;
    }

    public String getStartStation() {
        return startStation;
    }

    protected final void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getFinalStation() {
        return finalStation;
    }

    protected final void setFinalStation(String finalStation) {
        this.finalStation = finalStation;
    }

    public int getCarriage() {
        return carriage;
    }

    protected final void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    protected final static void printTrainInfo(Train train) {
        System.out.println("Поезд " + train.getBrand() +
                ", модель " + train.getModel() +
                ", " + train.getYearRelease() + " год выпуска. Страна производства: " + train.getCountry() +
                ", скорость перевижения -- " + train.getSpeed() + " км/ч," +
                "отходит от станции " + train.getStartStation() +
                " следует до станции " + train.getFinalStation() +
                ". Цена поездки -- " + train.getPrice() + " рублей" +
                ", в поезде " + train.getCarriage() + " вагонов."
        )
        ;
    }

    @Override
    public void refill() {
        setFuelPercentage(100);
        System.out.println("Поезд был заправлен дизелем.");
    }
}
