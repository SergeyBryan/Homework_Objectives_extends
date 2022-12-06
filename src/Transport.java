public abstract class Transport {
    protected String brand;
    protected String model;
    protected final int yearRelease;
    protected final String country;
    protected String color;
    protected double speed;
    protected double fuelPercentage = 0;



    protected Transport(String brand, String model, int yearRelease, String country, String color) {
        if (brand == null) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "Default";
        } else {
            this.model = model;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (country == null) {
            this.country = "Default";
        } else {
            this.country = country;
        }
        if (yearRelease <= 0) {
            this.yearRelease = 2000;
        } else {
            this.yearRelease = yearRelease;
        }
    }
    protected Transport(String brand, String model, int yearRelease, String country, String color, double speed) {
        if (brand == null) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "Default";
        } else {
            this.model = model;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (country == null) {
            this.country = "Default";
        } else {
            this.country = country;
        }
        if (yearRelease <= 0) {
            this.yearRelease = 2000;
        } else {
            this.yearRelease = yearRelease;
        }
        if (speed < 0 || speed > 1000) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }
    protected Transport(String brand, String model, int yearRelease, String country,  double speed) {
        if (brand == null) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "Default";
        } else {
            this.model = model;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (yearRelease <= 0) {
            this.yearRelease = 2000;
        } else {
            this.yearRelease = yearRelease;
        }
        if (country == null) {
            this.country = "Default";
        } else {
            this.country = country;
        }
        if (speed < 0 || speed > 1000) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    public final String getBrand() {
        return this.brand;
    }
    protected final void setBrand(String brand) {
        this.brand = brand;
    }

    public final String getModel() {
        return model;
    }

    protected final void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    protected final void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public final void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getYearRelease() {
        return yearRelease;
    }
    public double getFuelPercentage() {
        return fuelPercentage;
    }

    protected void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage < 0 || fuelPercentage > 100) {
            this.fuelPercentage = 0;
        } else {
            this.fuelPercentage = fuelPercentage;
        }
    }
    public abstract void refill();
}
