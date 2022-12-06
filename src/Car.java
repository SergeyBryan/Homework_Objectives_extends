import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;

public class Car extends Transport {

    private float engineVolume;
    private String gearbox;
    private final String carBodyType;
    private String regNumber;
    private final int seats;
    private boolean rubberIsSummer;
    private Key key;
    private Insurance insurance;


    public Car(String model,
               String brand,
               int yearRealise,
               String country,
               String color,
               float engineVolume,
               String gearbox,
               String carBodyType,
               String regNumber,
               int seats,
               boolean rubberIsSummer,
               Key key,
               Insurance insurance) {
        super(model, brand, yearRealise, country, color);

        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (gearbox == null) {
            this.gearbox = "МКПП";
        } else {
            this.gearbox = gearbox;
        }
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
        if (carBodyType == null) {
            this.carBodyType = "Седан";
        } else {
            this.carBodyType = carBodyType;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.seats = 5;
        this.rubberIsSummer = true;
    }

    public Car(String model,
               String brand,
               int yearRealise,
               String country,
               String color,
               float engineVolume) {
        this(model, brand, yearRealise, country, color, engineVolume, "МКПП", "x000xx000", "Седан", 5, true, new Key(), new Insurance());
    }



    public float getEngineVolume() {
        return engineVolume;
    }

    public String getGearbox() {
        return gearbox;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isRubberIsSummer() {
        return rubberIsSummer;
    }

    public int getSeats() {
        return seats;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public Key getKey() {
        return key;
    }


    public final void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public final void setGearbox(String gearbox) {
        if (gearbox == null) {
            this.gearbox = "МКПП";
        } else {
            this.gearbox = gearbox;
        }
    }

    public final void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public final void setRubberIsSummer(boolean rubberIsSummer) {
        this.rubberIsSummer = rubberIsSummer;
    }

    public final void setKey(Key key) {
        this.key = key;
    }

    public final void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    //    METHODS
    public final void changeWheels() {
        rubberIsSummer = !rubberIsSummer;
    }

    public final boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char chars[] = regNumber.toCharArray();
        if (Character.isAlphabetic(chars[0]) || !Character.isDigit(4) || !Character.isDigit(5)) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }


    public static class Key {
        private final boolean radioEngineLaunching;
        private final boolean digitalCarAccess;

        public Key(boolean radioEngineLaunching, boolean digitalCarAccess) {
            this.radioEngineLaunching = radioEngineLaunching;
            this.digitalCarAccess = digitalCarAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRadioEngineLaunching() {
            return radioEngineLaunching;
        }

        public boolean isDigitalCarAccess() {
            return digitalCarAccess;
        }
    }

    public static class Insurance {
        private final LocalDate periodOfInsurance;
        private final double cost;
        private final String number;

        public Insurance(LocalDate periodOfInsurance, double cost, String number) {
            if (periodOfInsurance == null) {
                this.periodOfInsurance = LocalDate.now().plusDays(365);
            } else {
                this.periodOfInsurance = periodOfInsurance;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10000, null);
        }

        public LocalDate getPeriodOfInsurance() {
            return periodOfInsurance;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public final void checkPeriodOfInsurance() {
            if (periodOfInsurance.isBefore(LocalDate.now()) || periodOfInsurance.isEqual(LocalDate.now())) {
                System.out.println("Срочно менять страховку");
            }
        }

        public final void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
        }
    }
    public final static void printCarInfo(Car car) {
        System.out.println("Model is " + car.getBrand() +" " + car.getModel()
                + " color is " + car.getColor()
                + " realised " + car.getYearRelease()
                + " country production " + car.getCountry()
                + " engine volume is " + car.getEngineVolume()
        );
    }
    @Override
    public void refill() {
        setFuelPercentage(100);
        System.out.println("Машина была заправлена бензином.");
    }
}
